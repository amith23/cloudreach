package com.example.user_hostpots_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotspotsController {
	@GetMapping("/api")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
