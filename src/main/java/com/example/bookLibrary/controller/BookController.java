package com.example.bookLibrary.controller;

import com.example.bookLibrary.entity.BookEntity;
import com.example.bookLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public BookEntity addBook(@RequestBody BookEntity book) {
        return bookService.addBook(book);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public BookEntity getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
}
