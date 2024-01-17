package com.mayur.corespring.corespring.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/corespring/corespring/list/Listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("name of the hospital" + hospital.getName());
		System.out.println("depatment" + hospital.getDepatment().getClass());
		
	}

}
