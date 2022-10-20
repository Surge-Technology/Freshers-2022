package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
@GetMapping("/getname")
public String getname() {
	return "hiii pratiksha, good morning";
	
}
@GetMapping("/")
public String hi() {
	return "hi";}

}
