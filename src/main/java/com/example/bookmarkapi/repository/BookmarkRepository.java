package com.example.bookmarkapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmarkapi.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {

    
}