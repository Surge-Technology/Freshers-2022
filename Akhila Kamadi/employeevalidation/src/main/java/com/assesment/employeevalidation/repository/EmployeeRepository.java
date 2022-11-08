package com.assesment.employeevalidation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.employeevalidation.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Optional<Employee> findByFirstNameAndLastName(String firstName,String lastName);
}
