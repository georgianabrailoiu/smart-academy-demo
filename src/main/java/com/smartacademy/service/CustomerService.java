package com.smartacademy.service;

import com.smartacademy.model.Customer;

import java.util.Optional;

public interface CustomerService {

    String login(String username, String password);

    Optional<org.springframework.security.core.userdetails.User> findByToken(String token);

    Customer findById(Long id);
}
