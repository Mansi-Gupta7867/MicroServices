package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Question {

	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	private int questionid;
	private String question;
	private int quizId;
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public Question(int questionid, String question, int quizId) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.quizId = quizId;
	}
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", quizId=" + quizId + "]";
	}
	

	

}