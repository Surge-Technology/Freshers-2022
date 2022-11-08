package com.assesment.employeevalidation.service;

import java.util.List;

import com.assesment.employeevalidation.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public String saveEmployee(Employee employee);
}
