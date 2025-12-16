package com.example.asifEcommece.dto.Reponse;

import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AddressResponse {

    private int houseNo;

    private String city;

    private String state;

    private int pinCode;

    private CustomerResponse customer;


}
