package com.example.bookLibrary.repository;

import com.example.bookLibrary.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Long, BookEntity> {
}
