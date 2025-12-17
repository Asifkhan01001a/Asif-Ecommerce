package com.example.asifEcommece.Controller;

import com.example.asifEcommece.Model.Product;
import com.example.asifEcommece.Service.ProductService;
import com.example.asifEcommece.dto.Reponse.ProductResponce;
import com.example.asifEcommece.dto.Request.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity addProduct(@RequestParam("s-id") int sellerId,
                                     @RequestBody ProductRequest productRequest){
        try{
            return new ResponseEntity(productService.addProduct(sellerId,productRequest), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }

}
