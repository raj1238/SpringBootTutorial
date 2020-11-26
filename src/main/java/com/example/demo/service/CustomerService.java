package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(String id) {
        return customerRepository.findOneById(id);
    }

    public Customer save(Customer book) {
        return customerRepository.save(book);
    }

    public void delete(Customer book) {
        customerRepository.delete(book);
    }

    public void deleteAll() {
        customerRepository.deleteAll();
    }


}


