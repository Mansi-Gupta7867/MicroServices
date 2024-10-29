package com.example.Questions.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Questions.Reposatories.QuestionReposatories;
import com.example.Questions.entity.Question;
import com.example.Questions.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	public QuestionServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public QuestionReposatories questionRepo;

	@Override
	public Question add(Question questionsave) {
		// TODO Auto-generated method stub
		return questionRepo.save(questionsave);
	}

	@Override
	public List<Question> getAllQuestion() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public Question findQuestionById(int id) {
		// TODO Auto-generated method stub
		return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz NOT Found"));
	}

	@Override
	public List<Question> getQuestionOfQuiz(int quizId) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuizId(quizId);
	}
	

}
