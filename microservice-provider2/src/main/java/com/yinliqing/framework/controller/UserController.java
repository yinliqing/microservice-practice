package com.yinliqing.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动后访问浏览器访问：http://localhost:7902/user/sayHello
 * 
 * @author 尹立庆
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/sayHello")
	public String sayhello(){
		return "I`m provider 2 ,Hello consumer!";
	}
	@RequestMapping("/sayHi")
	public String sayHi(){
		return "I`m provider 2 ,Hi consumer!";
	}
	@RequestMapping("/sayHaha")
	public String sayHaha(){
		return "I`m provider 2 ,Haha consumer!";
	}
}
