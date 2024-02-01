package com.spring.helloworld.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	

	@RequestMapping("/hello")
	public  String HelloWorld(){
		
		return "hello print";
	}
}
