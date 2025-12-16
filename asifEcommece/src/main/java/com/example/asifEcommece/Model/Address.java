package com.example.asifEcommece.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int houseNo;


    @Column
    private String city;

    @Column
    private String state;

    @Column
    private int pinCode;

    @OneToOne
    @JoinColumn(name = "customer_id")
    Customer customer;
}
