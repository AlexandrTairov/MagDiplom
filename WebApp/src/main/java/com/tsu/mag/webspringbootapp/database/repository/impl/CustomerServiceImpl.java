package com.tsu.mag.webspringbootapp.database.repository.impl;

import com.tsu.mag.webspringbootapp.database.repository.CustomerDAO;
import com.tsu.mag.webspringbootapp.entity.Customer;
import com.tsu.mag.webspringbootapp.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl extends CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        customerDAO.save(customer);
        return null;
    }

    @Override
    public Customer getById(Long id) {
        return customerDAO.findOne(id);
    }
}
