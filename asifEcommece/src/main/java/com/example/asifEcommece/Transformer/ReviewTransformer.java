package com.example.asifEcommece.Transformer;

import com.example.asifEcommece.Model.Review;
import com.example.asifEcommece.dto.Reponse.ReviewResponse;
import com.example.asifEcommece.dto.Request.ReviewRequest;

public class ReviewTransformer {
    public static ReviewResponse reviewToReviewResponse(Review review){
        return ReviewResponse.builder()
                .review(review.getReviewComment())
                .ratingResponse(review.getRating())
                .build();
    }

    public static Review reviewRequestToReview(ReviewRequest reviewRequest){
        return Review.builder()
                .reviewComment(reviewRequest.getReviewComment())
                .rating(reviewRequest.getRating())
                .build();
    }
}
