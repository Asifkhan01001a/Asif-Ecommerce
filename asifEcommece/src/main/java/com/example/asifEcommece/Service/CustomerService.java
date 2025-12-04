package com.example.asifEcommece.Service;


import com.example.asifEcommece.Exception.CustomerNotFoundException;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import com.example.asifEcommece.Transformer.CustomerTransformer;
import com.example.asifEcommece.dto.Reponse.CustomerResponse;
import com.example.asifEcommece.dto.Request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerTransformer customerTransformer;

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        //Step 1
        Customer customer=customerTransformer.customerRequestToCustomer(customerRequest);
        //Step 2
        Customer addedCustomer = customerRepository.save(customer);
        //Step 3
        return customerTransformer.customerToCustomerResponce(addedCustomer);


    }

    public CustomerResponse getCustomer(int id) {
        Optional<Customer>optionalCustomer = customerRepository.findById(id);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("id " + id + " is not found");
        }
        return customerTransformer.customerToCustomerResponce(optionalCustomer.get());

    }


}
