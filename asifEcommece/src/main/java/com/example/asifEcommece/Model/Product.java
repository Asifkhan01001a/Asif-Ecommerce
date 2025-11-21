package com.example.asifEcommece.Model;


import com.example.asifEcommece.Enum.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String price;

    @Column
    @Enumerated(value = EnumType.STRING)
    Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    Seller seller;

    @OneToMany(mappedBy = "product")
    List<Review> reviews = new ArrayList<>();

    @ManyToMany(mappedBy = "products")
    List<OrderEntity>orders=new ArrayList<>();
}

