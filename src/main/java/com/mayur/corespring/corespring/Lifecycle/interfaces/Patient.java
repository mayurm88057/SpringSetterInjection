package com.mayur.corespring.corespring.Lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
 
	private int id;
 
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {
		System.out.println("in the hi ");
	}
	
	public void bye() {
		System.out.println("inside the destroy");
	}
    @Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}



	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("iniside after properties set()");
		
	}



	@Override
	public void destroy() throws Exception {
	System.out.println("inside the destroy() ");
		
	}
 
}
