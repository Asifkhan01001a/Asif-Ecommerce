package com.example.asifEcommece.dto.Request;

import com.example.asifEcommece.Enum.Category;
import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ProductRequest {


    private String name;

    private int price;

    private Category category;

}
