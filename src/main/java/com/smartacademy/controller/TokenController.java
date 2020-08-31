package com.smartacademy.controller;

import com.smartacademy.model.Token;
import com.smartacademy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/token",  produces = "application/json")
    public Token getToken(@RequestParam("username") final String username, @RequestParam("password") final String password) {
        String tokenString = customerService.login(username, password);
        if (StringUtils.isEmpty(tokenString)) {
            return new Token("no token found");
        }
        return new Token(tokenString);
    }
}
