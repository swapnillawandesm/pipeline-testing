package com.swappy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello Bhai";
	}
}
