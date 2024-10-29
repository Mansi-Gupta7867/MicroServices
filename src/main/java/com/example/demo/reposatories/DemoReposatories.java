package com.example.demo.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.quiz;

public interface DemoReposatories extends JpaRepository<quiz, Integer> {

}
