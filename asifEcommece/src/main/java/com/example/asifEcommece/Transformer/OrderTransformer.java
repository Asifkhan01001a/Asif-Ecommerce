package com.example.asifEcommece.Transformer;


import com.example.asifEcommece.Model.OrderEntity;
import com.example.asifEcommece.Repository_DAO.OrderRepository;
import com.example.asifEcommece.dto.Reponse.OrderResponce;

public class OrderTransformer {

    public static OrderResponce orderToOrderResponce(OrderEntity orderEntity){
        return OrderResponce.builder()
                .id(orderEntity.getId())
                .orderStatus(orderEntity.getOrderStatus())
                .value(orderEntity.getValue())
                .build();
    }


}
