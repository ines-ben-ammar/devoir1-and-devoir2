package com.article;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.article.entities.Article;
import com.article.repos.ArticleRepository;
import com.article.service.ArticleService;



@SpringBootTest
class ArticlesApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private ArticleService articleService;
	@Test
	public void testCreateProduit() {
	Article article = new Article("Telephone","rouge","samsung",1000,new Date());
	articleRepository.save(article);
}
	 @Test
	 public void testFindArticle()
	 {
	 Article article = articleRepository.findById(1L).get();
	 System.out.println(article);
	 }
	 @Test
	 public void testUpdateArticle()
	 {
	 Article a= articleRepository.findById(1L).get();
	 a.setPrixUnitaire(500);
	 articleRepository.save(a);
	 System.out.println(a);
	 }
	 @Test
	 public void testDeleteArticle() {
		 articleRepository.deleteById(1L);
	 }
	 @Test
	 public void testListerTousArticle()
	 {
	 List<Article> article = articleRepository.findAll();
	 for (Article a : article)
	 {
	 System.out.println(a);
	 }
}
	 @Test
	 public void testFindByLibelleContains()
	 {
	 Page<Article> a = articleService.getAllArticlesParPage(0,2);
	 System.out.println(a.getSize());
	 System.out.println(a.getTotalElements());
	 System.out.println(a.getTotalPages());
	 a.getContent().forEach(p -> {System.out.println(p.toString());
	  });
	 /*ou bien
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 } */
	 }
}
