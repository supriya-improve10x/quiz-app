package com.example.demo.controller;

import com.example.demo.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("all")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
