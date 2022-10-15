package com.project.thOct.Service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.thOct.Entity.Student;
import com.project.thOct.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	//using insert query
	public void insertStudent(Long id,String fullName, String rollNo, String email,
			String password, LocalDate DOB) {
		studentRepository.insertStudent(id, fullName, rollNo, email, password, DOB);
	}

	//method 1: Using student object
	public boolean studentLogin(String email, String password) {
		if(studentRepository.existsByEmailAndPassword(email,password)) {
			return true;
		}
		return false;
	}
	
	//method 2: using path variables check email and password
	public boolean checkStudentLogin(String email,String password) {
		Optional<Student> optStudent = studentRepository.findByEmailAndPassword(email, password);
		if(optStudent.isPresent()) {
			return true;
		}
		return false;
	}
	
	//method 3 : using query check email and password
	public boolean getStudentByEmailAndPassword(String email,String password) {
		Optional<Student> optStudent = studentRepository.getStudentByEmailAndPassword(email, password);
		if(optStudent.isPresent()) {
			return true;
		}
		return false;
	}
	
	
	//save new record
	public void saveRecord(Student student) {
		studentRepository.save(student);
	}
	
}



