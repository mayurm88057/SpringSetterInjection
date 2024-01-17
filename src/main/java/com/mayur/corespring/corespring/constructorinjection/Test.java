package com.mayur.corespring.corespring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/corespring/corespring/constructorinjection/CConfig.xml");
	Employee emp = (Employee) context.getBean("employee");
	System.out.println(emp);
	
	}
}
