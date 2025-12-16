package com.example.asifEcommece.Service;


import com.example.asifEcommece.Exception.CustomerNotFoundException;
import com.example.asifEcommece.Exception.ProductNotFoundException;
import com.example.asifEcommece.Exception.ReviewNotFoundException;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Model.Product;
import com.example.asifEcommece.Model.Review;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import com.example.asifEcommece.Repository_DAO.ProductRepository;
import com.example.asifEcommece.Repository_DAO.ReviewRepository;
import com.example.asifEcommece.Transformer.ReviewTransformer;
import com.example.asifEcommece.dto.Reponse.ReviewResponse;
import com.example.asifEcommece.dto.Request.ReviewRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public final CustomerRepository customerRepository;

    public final ProductRepository productRepository;

    public ReviewResponse getReview(int id) {
        Optional<Review>optionalReview = reviewRepository.findById(id);
        if(optionalReview.isEmpty()){
            throw new ReviewNotFoundException("id "+id+" review not found");
        }

        Review review = optionalReview.get();

        return ReviewTransformer.reviewToReviewResponse(review);
    }
    public ReviewResponse addReview(int customerId, int productId, ReviewRequest reviewRequest) {
        Optional<Customer>optionalCustomer=customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("customer with "+customerId+" id not exist " );
        }
        Optional<Product>productOptional=productRepository.findById(productId);
        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product with id "+ productId + " is not exist ");
        }

        Customer customer= optionalCustomer.get();
        Product product=productOptional.get();

        Review review=ReviewTransformer.reviewRequestToReview(reviewRequest);

        review.setCustomer(customer);
        review.setProduct(product);

        Review savedReview= reviewRepository.save(review);

        return ReviewTransformer.reviewToReviewResponse(savedReview);

    }
}
