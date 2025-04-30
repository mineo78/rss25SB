package fr.univrouen.rss25sb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guid;
    private String title;
    private String published;

    // Constructeurs
    public Article() {}

    public Article(String guid, String title, String published) {
        this.guid = guid;
        this.title = title;
        this.published = published;
    }

    // Getters et Setters

    // toString()
}
