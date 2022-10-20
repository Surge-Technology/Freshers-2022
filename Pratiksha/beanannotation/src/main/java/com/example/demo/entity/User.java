package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public User() {
		super();
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	public User(String name) {
		this.name=name;
	}

}
