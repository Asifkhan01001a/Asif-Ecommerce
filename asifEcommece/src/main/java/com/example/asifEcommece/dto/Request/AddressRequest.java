package com.example.asifEcommece.dto.Request;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class AddressRequest {


    private int houseNo;




    private String city;


    private String state;


    private int pinCode;

}
