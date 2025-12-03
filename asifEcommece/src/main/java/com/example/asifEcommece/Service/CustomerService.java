package com.example.asifEcommece.Service;


import com.example.asifEcommece.Exception.CustomerNotFoundException;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public Customer addCustomer(Customer customer) {

        Customer addedCustomer = customerRepository.save(customer);
        return addedCustomer;

    }

    public Customer getCustomer(int id) {
        Optional<Customer>optionalCustomer = customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("id " + id + " is not found");
        }

        Customer customer = optionalCustomer.get();
        return customer;
    }
}
