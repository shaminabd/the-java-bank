package com.projectx.the_java_bank.service;

import com.projectx.the_java_bank.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
