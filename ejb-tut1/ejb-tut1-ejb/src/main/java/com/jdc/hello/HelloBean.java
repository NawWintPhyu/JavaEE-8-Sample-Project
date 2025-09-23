package com.jdc.hello;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements HelloBeanLocal {

	public HelloBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return String.format("Hello %s!", name);
	}

}
