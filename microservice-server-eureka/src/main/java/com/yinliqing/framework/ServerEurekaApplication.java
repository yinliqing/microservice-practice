package com.yinliqing.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 首先启动Eureka Server
 * 
 * 启动后访问浏览器访问：http://localhost:8761/
 * 
 * @author 尹立庆
 *
 */
@SpringBootApplication
@EnableEurekaServer //标明是一个server
public class ServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);

        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }

}
