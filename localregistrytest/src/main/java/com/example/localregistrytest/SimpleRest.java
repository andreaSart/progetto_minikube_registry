package com.example.localregistrytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {
	
	
	@GetMapping("/simpleRest")
	public String simpleRest() {
		return "Simple Rest";
	}

}
