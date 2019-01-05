package com.example.bookLibrary.service.impl;

import com.example.bookLibrary.entity.BookEntity;
import com.example.bookLibrary.repository.BookRepository;
import com.example.bookLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookEntity> getAllBooks() {
        return null;
    }

    @Override
    public BookEntity getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public BookEntity addBook(BookEntity book) {
        return bookRepository.save(book);
    }
}
