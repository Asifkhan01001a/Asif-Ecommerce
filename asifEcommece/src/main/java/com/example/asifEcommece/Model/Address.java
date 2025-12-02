package com.example.asifEcommece.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address {

    @Id
    @Column
    private int id;

    @Column
    private int houseNo;

    @Column
    private String Street;

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
