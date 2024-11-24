package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greet")
	
	public ResponseEntity<List<String>> greet() {
		List<String> msgs = new ArrayList<>();
		msgs = Arrays.asList("Java", "SpringBoot", "Angular");
		return new ResponseEntity<>(msgs, HttpStatus.OK);
	}

}
