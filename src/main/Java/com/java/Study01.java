package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Study01 {

	public static void main(String[] args) {
		
//		Test test = new Test();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml"); // 
		Test test = context.getBean(Test.class);
		
		int a = test.a();
		System.out.println(a);

	}

}
