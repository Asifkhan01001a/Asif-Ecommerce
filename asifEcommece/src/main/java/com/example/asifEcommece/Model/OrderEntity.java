package com.example.asifEcommece.Model;

import com.example.asifEcommece.Enum.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class OrderEntity {

    @Id
    private int id;

    @Column
    private int total;

    @Column
//    @Enumerated()
    OrderStatus orderStatus;

}
