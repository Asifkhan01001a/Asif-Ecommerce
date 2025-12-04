package com.example.asifEcommece.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity

public class Review {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        @JsonIgnore
        Product product;
}
