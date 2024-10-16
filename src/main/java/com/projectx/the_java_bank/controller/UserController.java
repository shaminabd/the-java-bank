package com.projectx.the_java_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectx.the_java_bank.dto.BankResponse;
import com.projectx.the_java_bank.dto.CreditDebitRequest;
import com.projectx.the_java_bank.dto.EnquiryRequest;
import com.projectx.the_java_bank.dto.TransferRequest;
import com.projectx.the_java_bank.dto.UserRequest;
import com.projectx.the_java_bank.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/api/user")
@Tag(name= "User Account Management APIs")
public class UserController {
    
    @Autowired
    UserService userService;

    @Operation(
            summary= "Create New User Account",
            description= "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode= "201",
            description= "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
    @Operation(
            summary= "Balance Enquiry",
            description= "Given an account number, check how much the user has"
    )
    @ApiResponse(
            responseCode= "200",
            description= "Http Status 200 SUCCESS"
    )
    
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }
    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }
    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }
    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }
    
    
}
