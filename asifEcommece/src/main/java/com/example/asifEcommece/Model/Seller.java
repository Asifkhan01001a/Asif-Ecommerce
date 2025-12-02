package com.example.asifEcommece.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
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
public class Seller {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    @Min(value = 10)
    private String panNo;

    @OneToMany(mappedBy = "seller" )
    List<Product>products=new ArrayList<>();

}
