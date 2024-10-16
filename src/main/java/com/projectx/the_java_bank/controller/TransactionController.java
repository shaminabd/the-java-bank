package com.projectx.the_java_bank.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.DocumentException;
import com.projectx.the_java_bank.entity.Transaction;
import com.projectx.the_java_bank.service.BankStatement;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/bankStatement")
@AllArgsConstructor
public class TransactionController {
    
    private BankStatement bankStatement;

    @GetMapping
    public List<Transaction> generateBankStatement(@RequestParam String accountNumber,
                                                   @RequestParam String startDate,
                                                   @RequestParam String endDate)throws DocumentException, FileNotFoundException {
        return bankStatement.generateStatement(accountNumber, startDate, endDate);

    }
}
