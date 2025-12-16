package com.example.asifEcommece.dto.Request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ReviewRequest {

        private String reviewComment;

        private int rating;

}
