package com.example.asifEcommece.dto.Reponse;

import com.example.asifEcommece.Enum.Category;
import com.example.asifEcommece.Model.Seller;
import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ProductResponce {


    private String name;

    private int price;

    private Category category;

    private SellerResponse seller;


}
