package com.project.thOct.Repository;

import java.time.LocalDate;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.thOct.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Modifying
	@Query(
	  value = "insert into student (id, full_name, roll_no, email, password,date_of_birth) "
	  		+ "values (:id, :full_name, :roll_no, :email, :password, :date_of_birth)",nativeQuery = true)
	@Transactional
	void insertStudent(@Param("id") Long id,@Param("full_name") String fullName, @Param("roll_no") String rollNo, 
	  @Param("email") String email,@Param("password") String password, @Param("date_of_birth") LocalDate DOB);

	//method 1
	boolean existsByEmailAndPassword(String email, String password);
	
	//method 2
	Optional<Student> findByEmailAndPassword(String email,String password);
	
	//method3 using query
	@Query("SELECT s FROM Student s WHERE s.email = ?1 and s.password = ?2")
	Optional<Student> getStudentByEmailAndPassword(String email,String password);
	
	
//	List<Student> findByEmail(String email);
	
}
