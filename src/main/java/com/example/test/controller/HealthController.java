package com.example.test.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping(produces = MediaType.TEXT_HTML_VALUE, path = "/health")
	public String hello() {
		return "hello i am working";
	}

}
