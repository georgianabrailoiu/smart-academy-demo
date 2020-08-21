package com.smartacademy.controller;

import com.smartacademy.model.Customer;
import com.smartacademy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/api/users/user/{id}", produces = "application/json")
    public Customer getUserDetail(@PathVariable Long id) {
        return customerService.findById(id);
    }
}