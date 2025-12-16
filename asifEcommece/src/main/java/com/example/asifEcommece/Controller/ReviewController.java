package com.example.asifEcommece.Controller;


import com.example.asifEcommece.Model.Review;
import com.example.asifEcommece.Service.ReviewService;
import com.example.asifEcommece.dto.Request.ReviewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;


    @PostMapping
    public ResponseEntity addReview(@RequestParam("c-id") int customerId,
                                    @RequestParam("p-id") int productId,
                                    @RequestBody ReviewRequest reviewRequest){
        try{
            return new ResponseEntity(reviewService.addReview(customerId,productId,reviewRequest),HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping
    public ResponseEntity getReview(@RequestParam("id") int id){
        try{
            return new ResponseEntity(reviewService.getReview(id), HttpStatus.FOUND);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }    
    }
}
