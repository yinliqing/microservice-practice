package com.yinliqing.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * http://localhost:7901/user/sayHello
 * 
 * @author 尹立庆
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/sayHello")
	public String sayhello(){
		return "I`m provider 1 ,Hello consumer!";
	}
	@RequestMapping("/sayHi")
	public String sayHi(){
		return "I`m provider 1 ,Hi consumer!";
	}
	@RequestMapping("/sayHaha")
	public String sayHaha(){
		return "I`m provider 1 ,Haha consumer!";
	}
}
