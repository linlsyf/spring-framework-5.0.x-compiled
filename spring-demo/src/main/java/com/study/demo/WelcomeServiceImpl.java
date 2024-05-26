package com.study.demo;

public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String satHello(String name) {
		System.out.println("欢迎您:"+name);
		return "success";
	}
}