package com.yinliqing.framework;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.yinliqing.framework.client.UserClient;
import lombok.extern.slf4j.Slf4j;

/**
 * http://localhost:8003/hello
 * 
 * @author 尹立庆
 *
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerFeignHystrixApplication {
	/***/
	@ Bean
	public UserClient getUserClient(){
		return new UserClient();
	}
	 
	
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(ConsumerFeignHystrixApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        // log.info("\n----------------------------------------------------------\n\t" +
        System.out.print("\n----------------------------------------------------------\n\t" +
                "Application  is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                "swagger-ui: \t\thttp://" + ip + ":" + port + path + "/doc.html\n" +
                "HystrixDashboard: \t\thttp://" + ip + ":" + port + path + "/hystrix\n" +
                "----------------------------------------------------------");

    }

}
