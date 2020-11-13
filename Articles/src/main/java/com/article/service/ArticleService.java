package com.article.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.article.entities.Article;

public interface ArticleService {
	Article saveArticle(Article article);
	Article updateArticle(Article a);
	void deleteArticle(Article a);
	 void deleteArticleById(Long id);
	 Article getArticle(Long id);
	List<Article> getAllArticles();
	Page<Article> getAllArticlesParPage(int page, int size);
}
