package com.example.demo.controller;

import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;
@GetMapping("question")
    public String getAllQuestions(){
        return "Hi these are our questions";
    }
}
