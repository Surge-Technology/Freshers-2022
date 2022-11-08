package com.assesment.employeevalidation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.employeevalidation.model.Employee;
import com.assesment.employeevalidation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String saveEmployee(Employee employee) {
		Optional<Employee> optional = employeeRepository.findByFirstNameAndLastName(employee.getFirstName(), employee.getLastName());
		if(!optional.isPresent()) {
			this.employeeRepository.save(employee);
			return "Record added successfully!";
		}
		else {
			return "Employee "+employee.getFirstName()+" "+employee.getLastName()+" already exists.";
		}
	}
}
