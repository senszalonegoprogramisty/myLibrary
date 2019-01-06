package com.example.bookLibrary.controller;
// wyswietl wszystkich, dodaj nowego po id

import com.example.bookLibrary.entity.LenderEntity;
import com.example.bookLibrary.service.LenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return lenderService.getAllLenders();
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public LenderEntity addLender(@RequestBody LenderEntity lender){
        return lenderService.addLender(lender);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public LenderEntity getLenderById(@PathVariable Long id){
        return lenderService.getLenderById(id);
    }

    @RequestMapping(path = "/name/{name}", method = RequestMethod.GET)
    public LenderEntity getLenderByName(@PathVariable  String name) {
        return lenderService.getLenderByName(name);
    }

    @RequestMapping(path = "/surname/{surname}", method = RequestMethod.GET)
    public LenderEntity getLenderBySurname(@PathVariable String surname) {
        return lenderService.getLenderBySurname(surname);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable Long id) {
        lenderService.deleteLender(id);
    }
}
