package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication1 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication1.class, args);
		
		//private static ApplicationContext context = new AnnotationConfigApplicationContext("com.mycompany.myfirm.myproject.mybeans");
		Company objcompany=context.getBean(Company.class);
		objcompany.PrintComapny();
	}

}
