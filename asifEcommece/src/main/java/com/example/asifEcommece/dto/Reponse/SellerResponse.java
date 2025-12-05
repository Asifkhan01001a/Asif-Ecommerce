package com.example.asifEcommece.dto.Reponse;


import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class SellerResponse {

    private String name;

    private String city;

    Date createdAt;

}
