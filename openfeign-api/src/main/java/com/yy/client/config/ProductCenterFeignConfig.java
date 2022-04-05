package com.yy.client.config;

import com.yy.client.handler.FeignClientInterceptor;
import feign.Contract;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

/**
 * @author Yu
 * @create 2022-03-10 21:18
 * @Description 这个类不要添加@Configuration注解,不然会被作为全局配置文件
 */
public class ProductCenterFeignConfig {

    /**
     *  1.通过配置文件定义日志级别
     *  2.通过yml文件细粒度配置
     *
     *
     *  NONE,      不记录
     *  BASIC,     记录请求方法,URL,响应状态码以及执行时间 (建议)
     *  HEADERS,   记录BASIC级别的基础上,记录请求和响应的header
     *  FULL;      记录请求和响应的header,body,和元数据
     */
//    @Bean
//    public Logger.Level level() {
//        return Logger.Level.FULL;
//    }


    /**
     * 修改契约为默认的feign的契约
     * @return
     */
//    @Bean
//    public Contract fetContract(){
//        return new Contract.Default();
//    }

    @Bean
    public RequestInterceptor interceptor(){
        return new FeignClientInterceptor();
    }

}
