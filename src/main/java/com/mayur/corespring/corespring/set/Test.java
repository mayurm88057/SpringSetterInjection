package com.mayur.corespring.corespring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mayur/corespring/corespring/set/SetConfig.xml");
		CarDealer car = (CarDealer) context.getBean("cardealer");
		System.out.println("the car name is " + car.getName());
		System.out.println("the car models are " + car.getModels());
		
	}
	

}
