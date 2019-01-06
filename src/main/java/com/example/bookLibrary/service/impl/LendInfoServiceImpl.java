package com.example.bookLibrary.service.impl;

import com.example.bookLibrary.dto.LendInfoDto;
import com.example.bookLibrary.entity.LendInfoEntity;
import com.example.bookLibrary.exceptions.BadRequestException;
import com.example.bookLibrary.repository.BookRepository;
import com.example.bookLibrary.repository.LendInfoRepository;
import com.example.bookLibrary.repository.LenderRepository;
import com.example.bookLibrary.service.LendInfoService;
import com.example.bookLibrary.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LendInfoServiceImpl implements LendInfoService {

    private final LendInfoRepository lendInfoRepository;
    private final BookRepository bookRepository;
    private final LenderRepository lenderRepository;

    @Autowired
    public LendInfoServiceImpl(LendInfoRepository lendInfoRepository, BookRepository bookRepository, LenderRepository lenderRepository) {
        this.lendInfoRepository = lendInfoRepository;
        this.bookRepository = bookRepository;
        this.lenderRepository = lenderRepository;
    }

    @Override
    public LendInfoEntity addLendInfo(LendInfoDto info) {
        LendInfoEntity lendInfoEntity = new LendInfoEntity();

        if (info.getBookId() == null || info.getLenderId() == null || info.getDateTo() == null) {
            throw new BadRequestException("All fields must be set!");
        }

        lendInfoEntity.setDateTo(DateUtils.parseDate(info.getDateTo()));
        lendInfoEntity.setDateFrom(new Date());

        if (lendInfoEntity.getDateFrom() == null || lendInfoEntity.getDateTo() == null) {
            throw new BadRequestException("Invalid date format");
        }

        if (lendInfoEntity.getDateTo().before(lendInfoEntity.getDateFrom())) {
            throw new BadRequestException("DateTo must be after or equal today");
        }

        if (!bookRepository.findById(info.getBookId()).isPresent()) {
            throw new BadRequestException("Book with id=" + info.getBookId() + " not exist");
        }

        if (!lenderRepository.findById(info.getLenderId()).isPresent()) {
            throw new BadRequestException("Lender with id=" + info.getLenderId() + " not exist");
        }

        if (lendInfoRepository.existsByBookIdAndAndDateToAfter(info.getBookId(), lendInfoEntity.getDateFrom())) {
            throw new BadRequestException("Book already lent");
        }

        lendInfoEntity.setBookId(info.getBookId());
        lendInfoEntity.setLenderId(info.getLenderId());

        return lendInfoRepository.save(lendInfoEntity);
    }
}
