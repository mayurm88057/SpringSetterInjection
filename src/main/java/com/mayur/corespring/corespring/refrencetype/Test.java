package com.mayur.corespring.corespring.refrencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/mayur/corespring/corespring/refrencetype/config.xml");
		
		Student student = (Student) context.getBean("student");
   
	      System.out.println(student);
	}
}
