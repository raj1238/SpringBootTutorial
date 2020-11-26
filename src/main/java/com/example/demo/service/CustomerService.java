package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerService extends MongoRepository<Customer, String>  {

    public Customer findByFirstName(String customerFirstName);
    public List<Customer> findByLastName(String customerLastName);

}


