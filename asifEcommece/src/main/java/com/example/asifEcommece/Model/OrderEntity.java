package com.example.asifEcommece.Model;

import com.example.asifEcommece.Enum.OrderStatus;
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
public class OrderEntity {

    @Id
    @Column
    private int id;

    @Column
    private int value;

    @Column
    @Enumerated(value = EnumType.STRING)
    OrderStatus orderStatus;

    @ManyToMany
    List<Product>products=new ArrayList<>();

}
