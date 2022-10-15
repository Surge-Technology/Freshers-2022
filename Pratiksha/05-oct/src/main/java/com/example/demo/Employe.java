package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employe {
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void PrintEmpClass() {
		System.out.println("in method PrintEmpClass of employe class");
	}
	

}
