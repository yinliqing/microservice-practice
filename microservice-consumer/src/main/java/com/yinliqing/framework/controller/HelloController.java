package com.yinliqing.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * http://localhost:8001/hello
 * 
 * @author 尹立庆
 *
 */
@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello")
	public String hello1(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHello";

		//返回值类型和我们的业务返回值一致
		return restTemplate.getForObject(url, String.class);

	}
	@RequestMapping("/hi")
	public String hi(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHi";

		//返回值类型和我们的业务返回值一致
		return restTemplate.getForObject(url, String.class);

	}
	@RequestMapping("/haha")
	public String haha(){
		//指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
		String url="http://provider-user/user/sayHaha";
		//返回值类型和我们的业务返回值一致
		return restTemplate.getForObject(url, String.class);

	}
}
