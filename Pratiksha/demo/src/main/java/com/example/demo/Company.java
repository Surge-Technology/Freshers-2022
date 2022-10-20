package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	private String CompanyName;
	private String ComapnyAddress;
	@Autowired
	private Employe employe;
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getComapnyAddress() {
		return ComapnyAddress;
	}
	public void setComapnyAddress(String comapnyAddress) {
		ComapnyAddress = comapnyAddress;
	}
	
	public void PrintComapny() {
		System.out.println("in company..");
		employe.printempclass();
	}

}
