package com.example.bookLibrary.service;

import com.example.bookLibrary.dto.LendInfoDto;
import com.example.bookLibrary.entity.LendInfoEntity;

public interface LendInfoService {

    LendInfoEntity addLendInfo(LendInfoDto info);
}
