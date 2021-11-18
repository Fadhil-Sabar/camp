package com.enigma.vica.controller;

import com.enigma.vica.model.Transaction;
import com.enigma.vica.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction")
    public void insertTransaction(@RequestBody Transaction transaction){
        transactionService.insertTransaction(transaction);
    }
}