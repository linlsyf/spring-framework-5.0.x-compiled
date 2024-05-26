package com.study.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World");
		//1、获取Springbean的容器实例，先copyPath
		String xmlPath="E:\\study\\spring\\spring-framework\\spring_demo1\\src\\main\\resources\\spring\\spring-config.xml";
		// 自己配置文件的路径
		//2、用一个类去解析spring xml文件同时生成spring容器并返回，解析类
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext(xmlPath);
		//3、拿到spring容器以后就可以获取bean实例了
		WelcomeService welcomeService=(WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.satHello("我的名字叫spring");

	}

}
