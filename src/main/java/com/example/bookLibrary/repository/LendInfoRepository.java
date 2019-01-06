package com.example.bookLibrary.repository;

import com.example.bookLibrary.entity.LendInfoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface LendInfoRepository extends CrudRepository<LendInfoEntity, Long> {

    boolean existsByBookIdAndAndDateToAfter(Long bookId, Date date);
}
