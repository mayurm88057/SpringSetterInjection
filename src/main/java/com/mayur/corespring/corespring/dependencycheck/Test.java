package com.mayur.corespring.corespring.dependencycheck;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext(
				"com/mayur/corespring/corespring/dependencycheck/dpConfig.xml");
       Prescription prep = (Prescription) context.getBean("prescription");
       System.out.println(prep);
	
       
      
	}
}
