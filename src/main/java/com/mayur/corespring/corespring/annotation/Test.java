package com.mayur.corespring.corespring.annotation;

import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/corespring/corespring/annotation/AnoConfig.xml");
		Pateint pat = (Pateint) context.getBean("patient");
		System.out.println(pat);
		context.registerShutdownHook();

		
		
		
	}

}
// this command is the xml bean files cammand     
//<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>