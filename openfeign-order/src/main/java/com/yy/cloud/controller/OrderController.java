package com.yy.cloud.controller;

import com.yy.client.api.ProductFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yu
 * @create 2022-03-10 21:02
 * @Description
 */
@RestController
public class OrderController {

    @Autowired
    private ProductFeignApi productFeignApi;

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo) {

        String info = productFeignApi.selectProductInfoById(orderNo);


        return info;
    }

    @RequestMapping("/getToken")
    public String getToken() {
        return productFeignApi.getToken("123");
    }
}
