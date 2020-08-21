package com.smartacademy.service;

import com.smartacademy.model.Customer;
import com.smartacademy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String login(String username, String password) {
        Optional<Customer> customer = customerRepository.login(username, password);
        if (customer.isPresent()) {
            String token = UUID.randomUUID().toString();
            Customer custom = customer.get();
            custom.setToken(token);
            customerRepository.save(custom);
            return token;
        }

        return "";
    }

    @Override
    public Optional<User> findByToken(String token) {
        Optional<Customer> customer = customerRepository.findByToken(token);
        if (customer.isPresent()) {
            Customer customer1 = customer.get();
            User user = new User(customer1.getUserName(), customer1.getPassword(), true, true, true, true,
                    AuthorityUtils.createAuthorityList("USER"));
            return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public Customer findById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElse(null);
    }
}
