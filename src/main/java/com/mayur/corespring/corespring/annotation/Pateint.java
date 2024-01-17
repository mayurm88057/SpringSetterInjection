package com.mayur.corespring.corespring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pateint {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("in the ");
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("this is init method of hi");
	}

	@PreDestroy
	public void bye() {
		System.out.println("this is destroy method of bye");

	}

	@Override
	public String toString() {
		return "Pateint [id=" + id + "]";
	}

}
