package com.tsu.mag.webspringbootapp.service.customer;

import com.tsu.mag.webspringbootapp.database.repository.OrderRepository;
import com.tsu.mag.webspringbootapp.database.repository.impl.CustomerRepositoryImpl;
import com.tsu.mag.webspringbootapp.database.repository.impl.CustomerServiceImpl;
import com.tsu.mag.webspringbootapp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/customer", produces = APPLICATION_JSON_VALUE)
public abstract class CustomerService {

    @Autowired
    private CustomerServiceImpl customerService;

//    @Autowired
    private OrderRepository orderRepository;


    @GetMapping(value = "/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        try {
            customerService.getById(id);
//            Customer customer = customerService.getCustomerById(id);
//            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (NullPointerException exception) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return null;
    }

    @GetMapping(value = "/getAll")
    public List<Customer> getAllCustomers() {
        return null;
    }

    @PostMapping(value = "/create", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        try {

//            customerService.save(customer);
//            Customer createdCustomer = customerRepository.createCustomer(customer);
//            return new ResponseEntity<>(createdCustomer, HttpStatus.OK);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            System.out.println("Something went wrong! " + ex.getMessage());
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    public abstract Customer getById(Long id);
}
