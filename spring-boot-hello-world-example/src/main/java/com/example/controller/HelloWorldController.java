package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloWorldController   {
	
	@RequestMapping("/he")
	public String hello(){
		return "Hello javaTpoint";  
	}  
}  
