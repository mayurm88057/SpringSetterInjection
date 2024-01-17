package com.mayur.corespring.corespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("employee  name :" + emp.getName());
		System.out.println("empoloyee id  : " + emp.getId());
	}

}
