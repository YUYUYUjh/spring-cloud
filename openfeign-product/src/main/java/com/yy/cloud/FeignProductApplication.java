package com.yy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yu
 * @create 2022-03-10 21:22
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FeignProductApplication {

    public static void main(String[] args)
        {
            SpringApplication.run(FeignProductApplication.class,args);
        }

}
