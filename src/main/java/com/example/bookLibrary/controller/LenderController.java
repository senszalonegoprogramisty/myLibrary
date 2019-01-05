package com.example.bookLibrary.controller;
// wyswietl wszystkich, dodaj nowego po id

import com.example.bookLibrary.entity.LenderEntity;
import com.example.bookLibrary.service.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//TODO uzupelnic metody
@RestController
@RequestMapping("lender")
public class LenderController {

    private final LenderService lenderService;

    @Autowired
    public LenderController(LenderService lenderService) {
        this.lenderService = lenderService;
    }


    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<LenderEntity> getAllLenders(){
        return null;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public LenderEntity addLender(@RequestBody LenderEntity lender){
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public LenderEntity getLenderById(@PathVariable long id){
        return null;
    }

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public LenderEntity getLenderByName(@PathVariable  String name) {
        return null;
    }

    @RequestMapping(path = "/{surname}", method = RequestMethod.GET)
    public LenderEntity getLenderBySurname(@PathVariable String surname) {
        return null;
    }



}
