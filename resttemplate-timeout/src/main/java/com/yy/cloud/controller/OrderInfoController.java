package com.yy.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yu
 * @create 2022-03-10 23:46
 * @Description
 */
@RestController
public class OrderInfoController {
    @Autowired
    private RestTemplate restTemplate;


    public static final String uri = "http://localhost:1234/selectOrderInfoById/";

    @RequestMapping("/selectOrderInfoById/{orderNo}")
    public Object selectOrderInfoById(@PathVariable("orderNo") String orderNo) {

        String body = null;
        try {
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri + orderNo, String.class);
            body = responseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException("调用超时");
        }
        return body;
    }
}
