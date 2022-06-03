package com.example.restservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/teste")
	public String getTest() {
		
		return "hello world";
	}
	
}
