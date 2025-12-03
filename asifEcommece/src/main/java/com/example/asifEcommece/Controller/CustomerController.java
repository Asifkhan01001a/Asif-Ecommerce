package com.example.asifEcommece.Controller;

import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Service.CustomerService;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody Customer customer){
        log.info("the object is " + customer);
        Customer savedCustomer= customerService.addCustomer(customer);
        return new ResponseEntity(savedCustomer,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getCustomer(@RequestParam("id") int id){
        try{
            Customer getCustomerById = customerService.getCustomer(id);
            return new ResponseEntity<>(getCustomerById,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }

}

