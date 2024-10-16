package com.projectx.the_java_bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectx.the_java_bank.dto.TransactionDto;
import com.projectx.the_java_bank.entity.Transaction;
import com.projectx.the_java_bank.repository.TransactionRepository;

@Component
public class TransactionImpl implements TransactionService{
    
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
    
}
