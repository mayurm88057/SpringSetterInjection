package com.mayur.corespring.corespring.Lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/corespring/corespring/Lifecycle/interfaces/LcConfig.xml");
		Patient pat = (Patient) context.getBean("patient");
		System.out.println(pat);
		
	context.registerShutdownHook();
	}

}
