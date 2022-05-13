package com.yinliqing.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import com.yinliqing.framework.client.UserClient;

/**
 * http://localhost:8003/hello
 * 
 * 您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx
 * 
 * @author 尹立庆
 *
 */
@RestController
public class HelloController {

	@Autowired
	public UserClient userClient;

	/**
	 * 此处的mapping是一级controller，
	 * 调用方法里边绑定了二级的conroller，相当于用http完成一次转发
	 * @return
	 */
	@GetMapping("/hello")
	@HystrixCommand(fallbackMethod = "helloFallback")//失败时调用默认返回,
	public String hello(){
		return userClient.hello();
	}

	@GetMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiFailBack") //失败时调用默认返回,demo中现在我们的客户端调用的接口实际是不存在，所以这个接口会返回下方的默认值
	public String hi(){
		return userClient.sayHi();
	}

	@GetMapping("/haha")
	@HystrixCommand(fallbackMethod = "hahaFailBack")//失败时调用默认返回,demo中现在我们的客户端调用的接口实际是不存在，所以这个接口会返回下方的默认值
	public String haha(){
		return userClient.sayHaha();
	}


	/**
	 *
	 *  对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
	 * @return 失败调用时，返回默认值:
	 */
	public String helloFallback(){
		return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx1";
	}

	public String hiFailBack(){
		return "您请求的数据没拿到，我是hystrix返回的默认数据--hixxxx1";
	}

	public String hahaFailBack(){
		return "您请求的数据没拿到，我是hystrix返回的默认数据--hahaxxxx1";
	}

}
