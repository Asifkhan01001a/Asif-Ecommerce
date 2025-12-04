package com.example.asifEcommece.Service;


import com.example.asifEcommece.Exception.ReviewNotFoundException;
import com.example.asifEcommece.Model.Review;
import com.example.asifEcommece.Repository_DAO.ReviewRepository;
import com.example.asifEcommece.dto.Reponse.ReviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public ReviewResponse getReview(int id) {
        Optional<Review>optionalReview = reviewRepository.findById(id);
        if(optionalReview.isEmpty()){
            throw new ReviewNotFoundException("id "+id+" review not found");
        }
        return reviewToReviewResponse(optionalReview.get());
    }

    public ReviewResponse reviewToReviewResponse(Review review){
        return ReviewResponse.builder()
                .reviewResponse(review.getReviewComment())
                .ratingResponse(review.getRating())
                .build();
    }
}
