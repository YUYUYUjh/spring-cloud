package com.yy.cloud.controller;


import com.yy.client.api.ProductFeignApi;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现feignApi接口 , 防止接口修改服务提供者无法感知
 */
@RestController
@Slf4j
public class ProductInfoController implements ProductFeignApi {

    @Value("${server.port}")
    private String serverPort;

    @SneakyThrows
    @Override
    @RequestMapping("/selectProductInfoById/{productNo}")
    public String selectProductInfoById(@PathVariable("productNo") String productNo)  {
        Thread.sleep(5000);
        return serverPort+"   "+productNo;
    }

    @Override
    public String getToken(@RequestHeader("token") String token) {
        log.info("token:{}",token);
        return token;
    }

}
