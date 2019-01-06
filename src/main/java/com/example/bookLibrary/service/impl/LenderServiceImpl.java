package com.example.bookLibrary.service.impl;

import com.example.bookLibrary.entity.AddressEntity;
import com.example.bookLibrary.entity.LenderEntity;
import com.example.bookLibrary.exceptions.BadRequestException;
import com.example.bookLibrary.exceptions.ResourceNotFoundException;
import com.example.bookLibrary.repository.LenderRepository;
import com.example.bookLibrary.service.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        lender.setId(null);
        if (lender.getName() == null || lender.getName().trim().length() == 0) {
            throw new BadRequestException("Lender name must not be empty");
        }

        if (lender.getSurname() == null || lender.getSurname().trim().length() == 0)
            throw new BadRequestException("Lender surname must not be empty");
/*
        if (lender.getAddress() == null){
            throw new BadRequestException("Lender address must not be empty");
        }

*/
        return lenderRepository.save(lender);
    }

    @Override
    public LenderEntity getLenderById(Long id) {
        Optional<LenderEntity> lender = lenderRepository.findById(id);

        if (lender.isPresent()) {
            return lender.get();
        }

        throw new ResourceNotFoundException("Lender with id=" + id + " not found");
    }

    @Override
    public LenderEntity getLenderByName(String name) {
        Optional<LenderEntity> lender = lenderRepository.findByNameEquals(name);

        if (lender.isPresent()) {
            return lender.get();
        }

        throw new ResourceNotFoundException("Lender with name=" + name + " not found");
    }

    @Override
    public LenderEntity getLenderBySurname(String surname) {
        Optional<LenderEntity> lender = lenderRepository.findBySurnameEquals(surname);

        if (lender.isPresent()) {
            return lender.get();
        }

        throw new ResourceNotFoundException("Lender with surname=" + surname + " not found");
    }

    @Override
    public void deleteLender(Long id) {
        lenderRepository.deleteById(id);
    }
}
