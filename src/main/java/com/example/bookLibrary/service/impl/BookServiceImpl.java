package com.example.bookLibrary.service.impl;

import com.example.bookLibrary.entity.BookEntity;
import com.example.bookLibrary.exceptions.BadRequestException;
import com.example.bookLibrary.exceptions.ResourceNotFoundException;
import com.example.bookLibrary.repository.BookRepository;
import com.example.bookLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookEntity> getAllBooks() {
        return (List<BookEntity>) bookRepository.findAll();
    }

    @Override
    public BookEntity getBookById(Long id) {
        Optional<BookEntity> book = bookRepository.findById(id);

        if (book.isPresent()) {
            return book.get();
        }

        throw new ResourceNotFoundException("Book with id=" + id + " not found");
    }

    @Override
    public BookEntity addBook(BookEntity book) {
        book.setId(null);
        if (book.getTitle() == null || book.getTitle().trim().length() == 0) {
            throw new BadRequestException("Book title must not be empty");
        }

        if (book.getAuthor() == null || book.getAuthor().trim().length() == 0) {
            throw new BadRequestException("Book author must not be empty");
        }

        if (book.getIsbn() == null || book.getIsbn().trim().length() == 0) {
            throw new BadRequestException("Book isbn must not be empty");
        }

        if (bookRepository.findByIsbnEquals(book.getIsbn()).isPresent()) {
            throw new BadRequestException("Book with isbn='" + book.getIsbn() + "' already in database");
        }

        return bookRepository.save(book);
    }

    @Override
    public BookEntity getBookByTitle(String title) {
        Optional<BookEntity> book = bookRepository.findByTitleEquals(title);

        if (book.isPresent()) {
            return book.get();
        }

        throw new ResourceNotFoundException("Book with title='" + title + "' not found");
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
