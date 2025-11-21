package com.example.asifEcommece.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

//agar naam change karna ho to good practise


public class Address {

    @Id
    private int id;

    @Column
    private String houseNo;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private int pin;

    //unidirectional kis tarike ki relation
    //relationShip

    @OneToOne
            @JoinColumn(name = "customer_id")
    Customer customer;
}
