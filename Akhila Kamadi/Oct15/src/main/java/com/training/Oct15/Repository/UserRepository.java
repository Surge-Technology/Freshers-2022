package com.training.Oct15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Oct15.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
