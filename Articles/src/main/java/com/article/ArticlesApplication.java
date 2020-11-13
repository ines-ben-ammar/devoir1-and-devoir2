package com.article;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.article.entities.Article;
import com.article.service.ArticleService;

@SpringBootApplication
public class ArticlesApplication implements CommandLineRunner {
	@Autowired
ArticleService articleService;
	public static void main(String[] args) {
		SpringApplication.run(ArticlesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		articleService.saveArticle(new Article("chargeu","noir","asus",1500,new Date()));
		articleService.saveArticle(new Article("chargeuPC","noir","asus",1500,new Date()));
		articleService.saveArticle(new Article("chargeuPortable","noir","asus",1500,new Date()));
		articleService.saveArticle(new Article("chargeuPC","rouge","asus",1500,new Date()));
		articleService.saveArticle(new Article("chargeuPortable","rouge","asus",1500,new Date()));
		
	}

}
