package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.quiz;
import com.example.demo.servceImpl.DemoServiceImpl;
import com.example.demo.service.DemoService;




@RestController
@RequestMapping("/quiz")
public class cntrl {

	public cntrl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private DemoServiceImpl demoservice;
	
//	@PostMapping("/")
//	public quiz ronu(@RequestBody quiz quizsave) {
//		return  demoservice.add(quizsave);
//	}
	@PostMapping("/savequiz")
	public ResponseEntity<quiz> saveQuiz(@RequestBody quiz quizSave) {
	    quiz savedQuiz = demoservice.add(quizSave);
	    return ResponseEntity.status(HttpStatus.CREATED).body(savedQuiz);
	}

	  @GetMapping("/all")
	    public List<quiz> get() {
	        return demoservice.get();
	    }
	    @GetMapping("/{id}")
	    public quiz getOne(@PathVariable int id) {
	        return demoservice.get(id);
	    }


	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
