package com.expense.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String returnHello() {
		return "Hello Arya This App IS Running ";
	}
	
}
