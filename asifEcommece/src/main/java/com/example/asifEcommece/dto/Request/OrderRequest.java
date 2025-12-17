package com.example.asifEcommece.dto.Request;

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

public class OrderRequest {

    private int value;

    OrderStatus orderStatus;

}
