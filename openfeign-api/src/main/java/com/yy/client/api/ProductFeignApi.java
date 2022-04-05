package com.yy.client.api;

import com.yy.client.config.ProductCenterFeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yu
 * @create 2022-03-10 20:58
 * @Description
 */
@FeignClient(name = "product-center", configuration = ProductCenterFeignConfig.class)
//@FeignClient(name = "product-center")
public interface ProductFeignApi {


    /**
     * 通过feign默认注解调用
     * @param productNo
     * @return
     */
//    @RequestLine("GET /selectProductInfoById/{productNo}")
//    String selectProductInfoById(@Param("productNo") String productNo);

    @RequestMapping("/selectProductInfoById/{productNo}")
    String selectProductInfoById(@PathVariable String productNo);

    @RequestMapping("/getToken")
    String getToken(@RequestHeader("token") String token);
}
