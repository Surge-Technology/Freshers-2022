package com.training.Oct15.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Oct15.Entity.User;
import com.training.Oct15.POJO.UserRequest;
import com.training.Oct15.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User check(UserRequest req) {
		User user = new User();
		user.setName(req.getName());
		user.setNo(req.getNo());
		user.setAddress(req.getAddress());
		user.setGender("female");
		user.setPassword("Akki1234");
		return userRepository.save(user);
	}
}
