package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employe {
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void printempclass() {
		System.out.println("in emp class");
	}

}
