package com.example.rest.repository;

import com.example.rest.entity.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository<ArticleEntity,Integer> {
}
