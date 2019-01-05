package com.example.bookLibrary.repository;

import com.example.bookLibrary.entity.LenderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LenderRepository extends CrudRepository<LenderEntity, Long> {
}
