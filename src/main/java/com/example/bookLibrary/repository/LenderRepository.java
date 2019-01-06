package com.example.bookLibrary.repository;

import com.example.bookLibrary.entity.LenderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LenderRepository extends CrudRepository<LenderEntity, Long> {
    Optional<LenderEntity> findByNameEquals(String name);

    Optional<LenderEntity> findBySurnameEquals(String surname);
}
