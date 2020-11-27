package com.example.demo.api;

import com.example.demo.converter.CustomerConverter;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerResponse {

    @Autowired
    private CustomerService customerService;

    private CustomerConverter customerConverter = new CustomerConverter();

    @PostMapping
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO){

        Customer customer = customerConverter.DTOToEntity(customerDTO);
        Customer saved =  customerService.save(customer);
        return customerConverter.entityToDTO(saved);

    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @GetMapping(value="/{customerId}")
    public Customer getCustomer(@PathVariable(value="customerId") String customerId){
        return customerService.findById(customerId);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable(value="customerId") String customerId){
        Customer deleted = customerService.findById(customerId);
        customerService.delete(deleted);
    }
}
