package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.quiz;

public interface DemoService {
	quiz add(quiz quizsave);

	List<quiz> get();

	quiz get(int id);
}
