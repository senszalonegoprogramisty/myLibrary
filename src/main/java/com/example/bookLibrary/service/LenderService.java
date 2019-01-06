package com.example.bookLibrary.service;

import com.example.bookLibrary.entity.LenderEntity;

import java.util.List;
import java.util.Optional;

public interface LenderService {

    List<LenderEntity> getAllLenders();

    LenderEntity addLender(LenderEntity lender);

    LenderEntity getLenderById(Long id);

    LenderEntity getLenderByName(String name);

    LenderEntity getLenderBySurname(String surname);

    void deleteLender(Long id);
}
