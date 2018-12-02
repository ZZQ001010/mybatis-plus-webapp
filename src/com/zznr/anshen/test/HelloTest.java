package com.zznr.anshen.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloTest {

	@Test
	public void test(){
		ApplicationContext ioc = new ClassPathXmlApplicationContext("resources/spring/applicationContext-service.xml"); 
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
	}
}
