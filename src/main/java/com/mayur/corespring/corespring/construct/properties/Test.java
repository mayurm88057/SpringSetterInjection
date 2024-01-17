package com.mayur.corespring.corespring.construct.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/mayur/corespring/corespring/construct/properties/Config.xml");

	MyDao dao = (MyDao) context.getBean("mydao");
System.out.println(dao);
}
}