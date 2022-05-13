package com.yinliqing.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * http://localhost:8001/hello
 * 
 * @author 尹立庆
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
