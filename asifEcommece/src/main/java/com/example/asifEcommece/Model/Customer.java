package com.example.asifEcommece.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class Customer {

        @Id
        @Column
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

        @OneToOne
        Address address;

        @OneToMany
        List<Review> reviews = new ArrayList<>();



}
