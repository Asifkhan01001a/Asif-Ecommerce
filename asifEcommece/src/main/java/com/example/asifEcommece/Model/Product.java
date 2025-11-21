package com.example.asifEcommece.Model;


import com.example.asifEcommece.Enum.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
//    @Enumerated()
    Category category;

    @ManyToMany
            @JoinColumn(name = "seller")
    Seller seller;
}

