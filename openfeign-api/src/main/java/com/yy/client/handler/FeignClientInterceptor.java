package com.yy.client.handler;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

public class FeignClientInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("token", UUID.randomUUID().toString());
    }
}