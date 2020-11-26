package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findOneById(String id);

    List<Customer> findAll();

    void delete(Customer customer);

    void deleteAll();

}


