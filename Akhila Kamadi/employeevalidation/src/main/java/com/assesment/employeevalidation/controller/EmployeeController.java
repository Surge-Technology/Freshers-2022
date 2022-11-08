package com.assesment.employeevalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.employeevalidation.model.Employee;
import com.assesment.employeevalidation.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
}
