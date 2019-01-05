package com.example.bookLibrary.controller;

import com.example.bookLibrary.entity.BookEntity;
import com.example.bookLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book") //pasek adresu na str www
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //(na starcie) to co chce zbey controller robil i return null
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

    @RequestMapping(path = "/bytitle/{title}", method = RequestMethod.GET)
    public BookEntity getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
