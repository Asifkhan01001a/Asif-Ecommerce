package com.example.asifEcommece.Repository_DAO;

import com.example.asifEcommece.Model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,String> {
}
