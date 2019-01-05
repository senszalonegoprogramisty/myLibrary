package com.example.bookLibrary.service;

import com.example.bookLibrary.entity.LenderEntity;

import java.util.List;

public interface LenderService {

    List<LenderEntity> getAllLenders();

    LenderEntity addLender(LenderEntity lender);

    LenderEntity getLenderById(long id);

    LenderEntity getLenderByName(String name);

    LenderEntity getLenderBySurname(String surname);
}
