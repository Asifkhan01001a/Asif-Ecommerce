package com.example.asifEcommece;

import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import com.example.asifEcommece.Service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest

public class TestService {

    @Autowired
    CustomerRepository customerRepository;

    Customer customer=new Customer();

    Customer saveCustomer = customerRepository.save(customer);

    

}

