package com.example.asifEcommece.Model;


import com.example.asifEcommece.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Customer {

    @Id
    private int id;

    @Column
    private String name;

    @Column(nullable = false)
    private int age;


    @Column(unique = true,nullable = false)
    private String email;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(length = 10)
    private String mobileNo;

    //is se bidirectional ho gayi
//    @OneToOne(mappedBy = "customer")
//    Address address;

    //
    @OneToMany(mappedBy = "customer")
    List<Review> reviews=new ArrayList<>();
}
