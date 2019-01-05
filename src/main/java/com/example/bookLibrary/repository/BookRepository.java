package com.example.bookLibrary.repository;

import com.example.bookLibrary.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//CrudRepository<NazwaEncji, TypId> do zapamietania ze jest cos takiego
@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {

    Optional<BookEntity> findByTitleEquals(String title);

    Optional<BookEntity> findByIsbnEquals(String isbn);
}
