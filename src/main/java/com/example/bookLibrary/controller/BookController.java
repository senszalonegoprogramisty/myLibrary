package com.example.bookLibrary.controller;

import com.example.bookLibrary.entity.BookEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<BookEntity> getAllBooks() {
        return null;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public BookEntity addBook(@RequestBody BookEntity book) {
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public BookEntity getBookById(@PathVariable Long id) {
        return null;

    }
}
