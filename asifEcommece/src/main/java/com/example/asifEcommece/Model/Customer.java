package com.example.asifEcommece.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column
        private String name;

        @Column
        private int age;

        @Column
        @Email
        private String email;

        @Column
        private int mobNo;

        @CreationTimestamp
        Date createdAt;

//        @OneToOne
//        Address address;

        @OneToMany
        @JoinColumn(name="customer_id")
        @JsonIgnore
        List<Review> reviews = new ArrayList<>();



}
