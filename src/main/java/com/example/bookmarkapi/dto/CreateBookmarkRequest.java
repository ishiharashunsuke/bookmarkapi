package com.example.bookmarkapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateBookmarkRequest {

    @NotBlank(message = "Title is requireď")
    private String title;

    @NotBlank(message = "URL is required")
    private String url;
    private String description;
    @NotBlank(message = "Category is requireď")
    private String category;


    // getters n setters
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
    
}
