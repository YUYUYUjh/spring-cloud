package com.yy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yu
 * @create 2022-03-10 17:04
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9527Application {

    public static void main(String[] args)
        {
            SpringApplication.run(Nacos9527Application.class,args);
        }

}
