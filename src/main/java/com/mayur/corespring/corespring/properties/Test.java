package com.mayur.corespring.corespring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mayur/corespring/corespring/properties/config.xml");
	   CountryAndLanguages ctx = (CountryAndLanguages) context.getBean("countriesAndLangs");
System.out.println(ctx);
	
	}

}
