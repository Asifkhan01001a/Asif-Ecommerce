package com.example.asifEcommece.Exception;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException(String messege){
        super(messege);
    }
}
