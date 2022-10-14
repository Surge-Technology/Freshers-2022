package com.project.thOct.Entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="roll_no")
	private String rollNo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name="date_of_birth")
	private LocalDate DOB;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public Student(Long id, String fullName, String rollNo, String email, String password, LocalDate dOB) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.rollNo = rollNo;
		this.email = email;
		this.password = password;
		DOB = dOB;
	}

	public Student() {
	}
}
