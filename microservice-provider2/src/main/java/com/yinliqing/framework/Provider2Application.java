package com.yinliqing.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 首先启动Eureka Server
 * 
 * 启动后访问浏览器访问：http://localhost:7902/user/sayHello
 * 
 * @author 尹立庆
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider2Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }

}
