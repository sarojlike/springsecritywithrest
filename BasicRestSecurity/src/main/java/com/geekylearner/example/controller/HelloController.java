package com.geekylearner.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "hello World";
	}
	
	
}
