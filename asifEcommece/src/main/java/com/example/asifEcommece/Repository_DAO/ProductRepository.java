package com.example.asifEcommece.Repository_DAO;

import com.example.asifEcommece.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
