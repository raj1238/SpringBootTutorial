package com.example.demo.converter;

import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;

public class CustomerConverter {

    public CustomerDTO entityToDTO(Customer customer){

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setFirstName(customer.getCustomerFirstName());
        customerDTO.setLastName(customer.getCustomerLastName());
        return customerDTO;
    }

    public Customer DTOToEntity(CustomerDTO customerDTO){

        Customer customer = new Customer();
        customer.setCustomerFirstName(customerDTO.getFirstName());
        customer.setCustomerLastName(customerDTO.getLastName());
        return customer;
    }
}
