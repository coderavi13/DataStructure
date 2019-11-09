package com.ravi.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${com.name}")
	String name;
	@GetMapping("/")
	public String sayHello() {

		
		return "Hello "+name+ "!! You're doing great fdfdf" + LocalDateTime.now();
				
	}

}
