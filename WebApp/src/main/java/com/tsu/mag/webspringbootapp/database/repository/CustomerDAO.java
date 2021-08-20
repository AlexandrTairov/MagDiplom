package com.tsu.mag.webspringbootapp.database.repository;

import com.tsu.mag.webspringbootapp.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

    Customer getById(Long id);

    Customer createCustomer(Customer customer);
}
