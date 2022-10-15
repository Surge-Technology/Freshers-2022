package com.training.Oct15.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.Oct15.Entity.User;
import com.training.Oct15.POJO.UserRequest;
import com.training.Oct15.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/test")
	public User check(@RequestBody UserRequest req) {
		return userService.check(req);
	}
	
}
