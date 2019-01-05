package com.example.bookLibrary.service.impl;

import com.example.bookLibrary.entity.LenderEntity;
import com.example.bookLibrary.repository.LenderRepository;
import com.example.bookLibrary.service.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//TODO sprawdzanie czy uzytkownik nic nie zepsuje i obsluga bledow
@Service
public class LenderServiceImpl implements LenderService {

    private final LenderRepository lenderRepository;

    @Autowired
    public LenderServiceImpl(LenderRepository lenderRepository) {
        this.lenderRepository = lenderRepository;
    }

    @Override
    public List<LenderEntity> getAllLenders() {
        return (List<LenderEntity>) lenderRepository.findAll();
    }

    @Override
    public LenderEntity addLender(LenderEntity lender) {
        return lenderRepository.save(lender);
    }

    @Override
    public LenderEntity getLenderById(long id) {
        return null;
    }

    @Override
    public LenderEntity getLenderByName(String name) {
        return null;
    }

    @Override
    public LenderEntity getLenderBySurname(String surname) {
        return null;
    }
}
