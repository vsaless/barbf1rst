package com.example.demo.controller;


import com.example.demo.repository.BillionairesRepository;
import com.example.demo.entity.BillionairesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BillionairesController {

    private BillionairesRepository repository;

    @Autowired
    public BillionairesController(BillionairesRepository repository){

        this.repository=repository;

    }

    @PostMapping("/billionaires")
    public ResponseEntity<String> salvarNobanco(@RequestBody BillionairesEntity entity){

        this.repository.save(entity);

        return ResponseEntity.ok("OK");
    }


}
