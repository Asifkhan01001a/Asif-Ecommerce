package com.example.asifEcommece.Model;

import com.example.asifEcommece.Enum.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    @Enumerated(value = EnumType.STRING)
    Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    @JsonIgnore
    Seller seller;

    @OneToMany
    List<Review>reviews=new ArrayList<>();

    @ManyToMany
    List<OrderEntity>orders=new ArrayList<>();
}

