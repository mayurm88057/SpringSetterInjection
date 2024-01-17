package com.mayur.corespring.corespring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
			("com/mayur/corespring/corespring/map/mapConfig.xml");
		  Customer cust = (Customer) ctx.getBean("customer");
		  System.out.println(cust);
	}

}
