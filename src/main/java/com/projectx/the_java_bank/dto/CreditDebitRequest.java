package com.projectx.the_java_bank.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditDebitRequest {
    private String accountNumber;
    private BigDecimal amount;
}
