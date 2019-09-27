package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "story")
public class Story {

    private long id;
    private String title;
    private String body;
    private String publishDate;

    public Story() {}


    public Story(String title, String body, String publishDate) {
        this.title = title;
        this.body = body;
        this.publishDate = publishDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "body", nullable = false)
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Column(name = "publishDate", nullable = false)
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }




    @Override
    public String toString() {
        return "Story [" +
                "id=" + id + ", " +
                "title=" + title + ", " +
                "body=" + body + ", " +
                "publishDate=" + publishDate
                + "]";
    }

}
