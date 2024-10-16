package com.projectx.the_java_bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.the_java_bank.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
    Boolean existsByEmail(String email);
    Boolean existsByAccountNumber(String accountNumber);
    User findByAccountNumber(String accountNumber);
}
