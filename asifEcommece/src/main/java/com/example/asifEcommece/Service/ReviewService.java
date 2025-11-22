package com.example.asifEcommece.Service;

import com.example.asifEcommece.Repository_DAO.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

//    public ResponseEntity getReviewById(int id) {
//        return new reviewRepository.getReferenceById(id);
//    }
}
