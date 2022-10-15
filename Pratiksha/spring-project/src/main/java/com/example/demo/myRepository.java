package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface myRepository extends JpaRepository<myEntity,Long> {



	@Query("SELECT s FROM myEntity s WHERE s.email = ?1 and s.password = ?2")
    Optional<myEntity> getEntityByEmailAndPassword(String email,String password);

}
