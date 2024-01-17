package com.mayur.corespring.corespring.Lifecycle;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside the setter method");
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void hi() {
		System.out.println("inside the hi ");
		
		
		
	}
	public void bye() {
		System.out.println("inside the bye");
	}
	
	

}
