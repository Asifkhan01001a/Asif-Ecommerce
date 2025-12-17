package com.example.asifEcommece.dto.Reponse;

import com.example.asifEcommece.Enum.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderResponce {

    private String id;

    private int value;

    private OrderStatus orderStatus;


}
