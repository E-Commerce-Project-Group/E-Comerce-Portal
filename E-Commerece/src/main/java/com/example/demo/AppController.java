package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	private int id;
	private String Name;
	
	
	
	@GetMapping("getHome")
	public String getHome() {
		return "Home";
		
		
		
	}
}
