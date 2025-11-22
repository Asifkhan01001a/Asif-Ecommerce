package com.example.asifEcommece.Controller;

import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer){
       ResponseEntity savedCustomer = customerService.addCustomer(customer);
       return new ResponseEntity(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getCustomerById(@RequestParam int id){
     customerService.getCustomerById(id);
    }
}

