package com.example.bookmarkapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bookmark {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    
    private String title;
    
    private String url;
    
    private String description;
    
    private String category;
    
    private LocalDateTime createdAt = LocalDateTime.now();

    //constructor
    public Bookmark() {

    }

    public Bookmark(String title, String url, String description, String category){
        this.title = title;
        this.url = url;
        this.description = description;
        this.category = category;
        this.createdAt = LocalDateTime.now();

    }

    //getters n setters

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }



}
