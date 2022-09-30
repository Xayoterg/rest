package com.example.rest.controller;

import com.example.rest.entity.ArticleEntity;
import com.example.rest.repository.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleRepo articleRepo;
    @PostMapping("addArticle")
    public String addArticle(@ModelAttribute ArticleEntity article){
        articleRepo.save(article);
        return "Статья добавлена";
    }
}
