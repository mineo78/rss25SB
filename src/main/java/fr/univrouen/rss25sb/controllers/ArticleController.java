package fr.univrouen.rss25sb.controllers;

import fr.univrouen.rss25sb.model.Article;
import fr.univrouen.rss25sb.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/addarticle")
    public String addArticle() {
        Article article = new Article("123", "Titre test", "2025-04-30T01:45:00");
        articleRepository.save(article);
        return "Article enregistré";
    }

}