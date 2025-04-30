package fr.univrouen.rss25sb.repository;

import fr.univrouen.rss25sb.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
