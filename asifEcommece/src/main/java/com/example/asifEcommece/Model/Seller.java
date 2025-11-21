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

    @Column(length = 10 ,unique = true)
    private String panNo;

    @Column
    private Double rating;

    @Column(unique = true,nullable = false)
    private String email;

    @OneToMany(mappedBy = "seller")
    List<Product> products=new ArrayList<>();


}
