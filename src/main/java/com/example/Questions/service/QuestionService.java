package com.example.Questions.service;

import java.util.List;

import com.example.Questions.entity.Question;

public interface QuestionService {
	Question add(Question questionsave);

	List<Question> getAllQuestion();

	Question findQuestionById(int id);
	List<Question> getQuestionOfQuiz(int quizId);

}
