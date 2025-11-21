package com.example.asifEcommece.Model;

import com.example.asifEcommece.Enum.OrderStatus;
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

public class OrderEntity {

    @Id
    @Column
    private int id;

    @Column
    private int total;

    @Column
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToMany
    @JoinTable
    List<Product>products=new ArrayList<>();
}
