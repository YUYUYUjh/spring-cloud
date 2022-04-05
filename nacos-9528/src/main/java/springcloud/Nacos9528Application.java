package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yu
 * @create 2022-03-10 17:04
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos9528Application {

    public static void main(String[] args)
        {
            SpringApplication.run(Nacos9528Application.class,args);
        }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
