package com.example.demo.servceImpl;

import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.quiz;
import com.example.demo.reposatories.DemoReposatories;
import com.example.demo.service.DemoService;
import com.example.demo.service.QuestionClient;
@Service
public class DemoServiceImpl implements DemoService{

	public DemoServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private DemoReposatories demoRepo;
    @Autowired
    private QuestionClient questionClient;
	@Override
	public quiz add(quiz quizsave) {
		// TODO Auto-generated method stub
		return  demoRepo.save(quizsave);
	}

//	@Override
//	public List<quiz> get() {
//		// TODO Auto-generated method stub
//		List<quiz>quizzes = demoRepo.findAll();
//		 List<quiz> newQuizList = quizzes.stream().map(q -> {
//		        q.setQuestions(questionClient.getQuestionOfQuiz(q.getId()));
//		        return q; // Return the modified quiz object
//		    }).collect(Collectors.toList());
//
//	return newQuizList;
//	}
	@Override
	public List<quiz> get() {
	    List<quiz> quizzes = demoRepo.findAll();
	    
	    List<quiz> newQuizList = quizzes.stream().map(q -> {
	        try {
	            System.out.println("Fetching questions for quiz ID: " + q.getId());
	            q.setQuestions(questionClient.getQuestionOfQuiz(q.getId()));
	        } catch (Exception e) {
	            System.err.println("Error fetching questions for quiz ID: " + q.getId());
	            e.printStackTrace();
	            q.setQuestions(Collections.emptyList()); // Handle error
	        }
	        return q; // Return the modified quiz object
	    }).collect(Collectors.toList());

	    return newQuizList;
	}

	@Override
	public quiz get(int id) {
		// TODO Auto-generated method stub
		quiz q = demoRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz NOT Found"));
	q.setQuestions(questionClient.getQuestionOfQuiz(q.getId()));
	return q;
	}

}
