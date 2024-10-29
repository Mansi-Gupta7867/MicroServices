package com.example.Questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Questions.entity.Question;
import com.example.Questions.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	public QuestionController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired 
	public QuestionService questionservice;
	
	@GetMapping("/jack")
	public String jack() {
		return "jack";
	}
	@PostMapping("/savequestion")
	public Question saveQuestion(@RequestBody Question questionsave) {
		return  questionservice.add(questionsave);
		
	}
	@GetMapping("/allquestion")
	public List<Question> getall(){
		return questionservice.getAllQuestion();
	}
	@GetMapping("/{id}")
	public Question findQuestionById(@PathVariable int id) {
		return questionservice.findQuestionById(id);
	}
	@GetMapping("/quiz/{quizId}")
     public List<Question>getQuestionsOfQuiz(@PathVariable int quizId){
    	 return  questionservice.getQuestionOfQuiz(quizId);
     }
}
