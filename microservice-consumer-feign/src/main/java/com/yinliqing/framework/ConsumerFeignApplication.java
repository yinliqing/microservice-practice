package com.yinliqing.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;


/**
 * http://localhost:8002/hello
 * 
 * @author 尹立庆
 * 
 * This annotation has been deprecated as of the 3.0.1 release.
 * @EnableDiscoveryClient is no longer needed, discovery client implementations 
 * are enabled as long as an implementation is on the classpath.
 * @EnableCircuitBreaker is no longer used now that Hystrix 
 * has been removed from Spring Cloud.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yinliqing.*") //开启feign
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ConsumerFeignApplication.class, args);
	}

}
