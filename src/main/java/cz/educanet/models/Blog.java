package cz.educanet.models;

import java.util.UUID;

public class Blog {
    private final String uuid;
    private String title;
    private String article;

    public Blog(String uuid, String title, String article) {
        this.uuid = uuid;
        this.title = title;
        this.article = article;
    }

    public Blog(String title, String article) {
        this(UUID.randomUUID().toString(), title, article);
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
