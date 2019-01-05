package com.example.bookLibrary.service;


import com.example.bookLibrary.entity.BookEntity;

import java.util.List;

public interface BookService {

    List<BookEntity> getAllBooks();

    BookEntity getBookById(Long id);

    BookEntity addBook(BookEntity book);
}
