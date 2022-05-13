package com.yinliqing.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yinliqing.framework.service.UserClient;

/**
 * http://localhost:8002/hello
 * 
 * @author 尹立庆
 *
 */
@RestController
public class HelloController {
	@Autowired
	private UserClient userClient;
	/**
	 * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
	 * @return
	 */
	@GetMapping("/hello")
	public String hello(){
		return userClient.sayHello();
	}

	@GetMapping("/hi")
	public String hi(){
		return userClient.sayHi();
	}

	@GetMapping("/haha")
	public String haha(){
		return userClient.sayHaha();
	}


}
