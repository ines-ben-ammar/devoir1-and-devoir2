package com.article.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.article.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
