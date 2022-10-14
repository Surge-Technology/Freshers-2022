package com.project.thOct.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.thOct.Entity.Student;
import com.project.thOct.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//using insert query... insert values into DB
	@PostMapping("/insert")
	public void fillStudentData(@RequestBody Student student) {
		studentService.insertStudent(student.getId(),student.getFullName(),student.getRollNo(),
				student.getEmail(),student.getPassword(),student.getDOB());
	}
	
	//method1 : Using student object,check email and password
	@GetMapping("/checkLogin")
	public boolean studentLogin(@RequestBody Student student) {
		if(studentService.studentLogin(student.getEmail(), student.getPassword())) {
			return true;
		}
		return false;
	}
	
	//method 2: using path variables, check email and password
	@GetMapping("/checkLogin/{email}/{password}")
	public boolean checkStudentLogin(@PathVariable String email, @PathVariable String password) {
		Optional<Student> optStudent = studentService.checkStudentLogin(email, password);
		if(optStudent.isPresent()) {
			return true;
		}
		return false;
	}
	
	//method 3: Using path variables and query,check email and password
	@GetMapping("/getStudentByEmailAndPassword/{email}/{password}")
	public boolean checkStudentLoginDetails(@PathVariable String email, @PathVariable String password) {
		Optional<Student> optStudent = studentService.getStudentByEmailAndPassword(email, password);
		if(optStudent.isPresent()) {
			return true;
		}
		return false;
	}
	
	//Adding new record to DB
	@PostMapping("/save")
	public void saveRecord(@RequestBody Student student) {
		studentService.saveRecord(student);
	}
}
