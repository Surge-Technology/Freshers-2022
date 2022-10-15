package com.example.demo.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import java.lang.String;

import com.example.demo.service.UserService;

@Configuration
public class myConfigration {
@Bean(name= {"User1","User2","User3"})
  public UserService getUser() {
		return new UserService();
	}

}
