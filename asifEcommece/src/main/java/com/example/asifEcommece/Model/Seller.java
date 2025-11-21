package com.example.asifEcommece.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Seller {

    @Id
    private int sellerId;

    @Column(length = 50)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;

    @Column
    private String panNo;

    @Column
    private Double rating;

    @Column
    private int mobileNo;

    @OneToMany
    List<Product> products=new ArrayList<>();


}
