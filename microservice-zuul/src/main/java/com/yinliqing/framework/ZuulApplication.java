package com.yinliqing.framework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;

import com.netflix.config.ChainedDynamicProperty;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.DynamicServerListLoadBalancer;
/**
 * http://localhost:9000/u/user/sayHello
 * --->route--->
 * http://localhost:7901/user/sayHello
 * 
 * http://localhost:9000/c/user/sayHello
 * 
 * @author 尹立庆
 *
 */
@SpringBootApplication
@EnableZuulProxy  //开启zuul代理
@EnableEurekaClient		//zuul服务要注册到Eureka上
@EnableDiscoveryClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
        BasicErrorController b = null;
        
        ChainedDynamicProperty c = null;
        BaseLoadBalancer b1 = null;
        DynamicServerListLoadBalancer d = null;
        SendErrorFilter s = null;
    }
}
