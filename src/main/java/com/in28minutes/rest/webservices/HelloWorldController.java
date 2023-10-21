package com.in28minutes.rest.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping()
	public String homePage() {
		return "Home Page";
	}
	
	@GetMapping(value = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

}
