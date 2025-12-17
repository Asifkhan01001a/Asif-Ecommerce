package com.example.asifEcommece.Transformer;

import com.example.asifEcommece.Model.Product;
import com.example.asifEcommece.dto.Reponse.ProductResponce;
import com.example.asifEcommece.dto.Reponse.SellerResponse;
import com.example.asifEcommece.dto.Request.ProductRequest;

import java.util.ArrayList;

public class ProductTransformer {

    public static Product productRequestToProduct(ProductRequest productRequest){
        return Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .category(productRequest.getCategory())
                .reviews(new ArrayList<>())
                .orders(new ArrayList<>())
                .build();
    }
    public static ProductResponce productToProductResponse(Product product){
        return ProductResponce.builder()
                .name(product.getName())
                .price(product.getPrice())
                .category(product.getCategory())
                .seller(SellerTransformer.sellerToSellerResponce(product.getSeller()))
                .build();
    }

}

