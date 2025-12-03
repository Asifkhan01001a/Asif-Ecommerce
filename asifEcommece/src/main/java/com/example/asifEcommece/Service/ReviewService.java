package com.example.asifEcommece.Service;


import com.example.asifEcommece.Exception.ReviewNotFoundException;
import com.example.asifEcommece.Model.Review;
import com.example.asifEcommece.Repository_DAO.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public Review getReview(int id) {
        Optional<Review>optionalReview = reviewRepository.findById(id);
        if(optionalReview.isEmpty()){
            throw new ReviewNotFoundException("id "+id+" review not found");
        }
        Review review=optionalReview.get();
        return review;
    }
}
