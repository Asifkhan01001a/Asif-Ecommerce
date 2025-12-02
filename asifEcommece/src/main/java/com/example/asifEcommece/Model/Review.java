package com.example.asifEcommece.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Review {

        @Id
        @Column
        private int id;

        @Column
        private String reviewComment;

        @Min(value = 1)
        @Max(value = 5)
        @Column
        private int rating;

        @ManyToOne
        @JoinColumn(name = "customer_id")
        Customer customer;

        @ManyToOne
        @JoinColumn(name = "product_id")
        Product product;
}
