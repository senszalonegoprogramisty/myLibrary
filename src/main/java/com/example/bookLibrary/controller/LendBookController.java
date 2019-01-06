package com.example.bookLibrary.controller;

import com.example.bookLibrary.dto.LendInfoDto;
import com.example.bookLibrary.entity.LendInfoEntity;
import com.example.bookLibrary.service.LendInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lend")
public class LendBookController {

    private final LendInfoService lendInfoService;

    @Autowired
    public LendBookController(LendInfoService lendInfoService) {
        this.lendInfoService = lendInfoService;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public LendInfoEntity addLendInfo(@RequestBody LendInfoDto info) {
        return lendInfoService.addLendInfo(info);
    }
}
