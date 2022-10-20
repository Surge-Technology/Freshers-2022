package com.example.demo;



//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.service.UserService;

@SpringBootApplication
public class BeanannotationApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanannotationApplication.class);
		UserService userservice=ctx.getBean(UserService.class);
		System.out.println("printing user serives::"+userservice.getList());
	}

}
