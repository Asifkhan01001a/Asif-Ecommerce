package com.example.asifEcommece.dto.Reponse;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse {

    private String name;

    private String email;

    Date createdAt;

}
