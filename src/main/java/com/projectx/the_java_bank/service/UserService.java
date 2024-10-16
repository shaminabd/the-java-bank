package com.projectx.the_java_bank.service;

import com.projectx.the_java_bank.dto.BankResponse;
import com.projectx.the_java_bank.dto.CreditDebitRequest;
import com.projectx.the_java_bank.dto.EnquiryRequest;
import com.projectx.the_java_bank.dto.TransferRequest;
import com.projectx.the_java_bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
}
