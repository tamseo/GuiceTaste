package com.obizware.test.tasteofguice;

public class HelloServiceImpl implements HelloService {

	public String helloWorld(String hello) {
		return "Hello " + hello;
	}

}
