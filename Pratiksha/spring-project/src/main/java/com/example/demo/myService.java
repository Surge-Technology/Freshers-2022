package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class myService {
	

@Autowired
myRepository repo;

public myEntity studentdetails(myEntity obj) {
	return repo.save(obj);
	
}

public boolean getEntityByEmailAndPassword(String email,String password) {
    Optional<myEntity> optStudent = repo.getEntityByEmailAndPassword(email, password);
    if(optStudent.isPresent()) {
        return true;
    }
    return false;
}
	
}

