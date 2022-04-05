package com.yy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Yu
 * @create 2022-03-10 21:01
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yy.client.api"})
public class FeignOrderApplication {
    public static void main(String[] args)
        {
            SpringApplication.run(FeignOrderApplication.class,args);
        }

}
