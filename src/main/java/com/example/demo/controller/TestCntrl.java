package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class TestCntrl {

	public TestCntrl() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/test")
	public String Test() {
		return "test";
	}

}
