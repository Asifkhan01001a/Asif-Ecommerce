package com.example.asifEcommece.Controller;

import com.example.asifEcommece.Annotaion.PrintHello;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Service.CustomerService;
import com.example.asifEcommece.dto.Reponse.CustomerResponse;
import com.example.asifEcommece.dto.Request.CustomerRequest;
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
    @PrintHello
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest){
        log.info("the object is " + customerRequest);

        CustomerResponse customerResponse = customerService.addCustomer(customerRequest);
        return new ResponseEntity(customerResponse,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getCustomer(@RequestParam("id") int id){
        try{
            CustomerResponse getCustomerById = customerService.getCustomer(id);
            return new ResponseEntity<>(getCustomerById,HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }

}

