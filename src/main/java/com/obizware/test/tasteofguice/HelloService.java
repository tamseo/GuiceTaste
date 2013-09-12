package com.obizware.test.tasteofguice;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloServiceImpl.class)
public interface HelloService {

	String helloWorld(String hello);
}
