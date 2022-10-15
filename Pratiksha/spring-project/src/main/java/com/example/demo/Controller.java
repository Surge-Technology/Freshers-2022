package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@Autowired
private myService serobj;

@PostMapping("/studentdetails")
public myEntity insertstudent(@RequestBody myEntity entity) {
	serobj.studentdetails(entity);
	return entity;
	
}

@GetMapping("/studentlogin/{email}/{password}")
public boolean studentlogin(@PathVariable String email,@PathVariable String password) {
	 return serobj.getEntityByEmailAndPassword(email, password);
		
}

}
