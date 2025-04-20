package com.example.bookmarkapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bookmarkapi.dto.CreateBookmarkRequest;
import com.example.bookmarkapi.model.Bookmark;
import com.example.bookmarkapi.repository.BookmarkRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkController(BookmarkRepository bookmarkRepository){
        this.bookmarkRepository = bookmarkRepository;
    }
    
    @GetMapping
    public List<Bookmark> getAllBookmarks(){
        return bookmarkRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Bookmark> createBookmark(@Valid @RequestBody CreateBookmarkRequest req){
        Bookmark bookmark = new Bookmark();

        bookmark.setTitle(req.getTitle());
        bookmark.setUrl(req.getUrl());
        bookmark.setDescription(req.getDescription());
        bookmark.setCategory(req.getCategory());

        Bookmark saved = bookmarkRepository.save(bookmark);

        return new ResponseEntity<>(saved,HttpStatus.CREATED);
    }

}
