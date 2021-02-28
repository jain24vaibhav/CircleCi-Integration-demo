package com.vaibhavjain.circleci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello CircliCi";
	}
	
	@GetMapping(value = "/hi")
	public String hi() {
		return "Hi CircliCi";
	}
	

}
