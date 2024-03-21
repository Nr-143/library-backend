package com.example.nirmal.fullstackbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String books;
    private String titles;


    private String journals;

    private String cD;
    private String volumes;
    private String project;
    private String question;
    private String news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getJournals() {
        return journals;
    }

    public void setJournals(String journals) {
        this.journals = journals;
    }

    public String getcD() {
        return cD;
    }

    public void setcD(String cD) {
        this.cD = cD;
    }

    public String getVolumes() {
        return volumes;
    }

    public void setVolumes(String volumes) {
        this.volumes = volumes;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
