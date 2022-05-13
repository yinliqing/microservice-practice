package com.yinliqing.framework.client;

/**
 * 
 * @author 尹立庆
 *
 */
public class UserClient implements IUserClient {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx2";
	}

	@Override
	public String sayHi() {
		// TODO Auto-generated method stub
		return "您请求的数据没拿到，我是hystrix返回的默认数据--hixxxx2";
	}

	@Override
	public String sayHaha() {
		// TODO Auto-generated method stub
		return "您请求的数据没拿到，我是hystrix返回的默认数据--hahaxxxx2";
	}

}
