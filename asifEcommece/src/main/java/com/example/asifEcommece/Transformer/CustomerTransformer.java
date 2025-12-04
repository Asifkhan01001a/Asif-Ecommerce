package com.example.asifEcommece.Transformer;

import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.dto.Reponse.CustomerResponse;
import com.example.asifEcommece.dto.Request.CustomerRequest;
import org.hibernate.annotations.Comments;
import org.springframework.stereotype.Component;

@Component
public class CustomerTransformer {

    public Customer customerRequestToCustomer(CustomerRequest customerRequest){
        return Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .email(customerRequest.getEmail())
                .mobNo(customerRequest.getMobNo())
                .build();
    }

    public CustomerResponse customerToCustomerResponce(Customer customer){
        return CustomerResponse.builder()
                .name(customer.getName())
                .email(customer.getEmail())
                .createdAt(customer.getCreatedAt())
                .build();
    }

}
