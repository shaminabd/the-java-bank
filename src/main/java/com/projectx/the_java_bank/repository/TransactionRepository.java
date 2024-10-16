package com.projectx.the_java_bank.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.the_java_bank.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{
     List<Transaction> findByAccountNumberAndCreatedAtBetween(String accountNumber, LocalDate startDate, LocalDate endDate);
}
