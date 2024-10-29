package com.example.Questions.Reposatories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Questions.entity.Question;

public interface QuestionReposatories  extends JpaRepository<Question, Integer>{
List <Question>findByQuizId(int quizId);
}
