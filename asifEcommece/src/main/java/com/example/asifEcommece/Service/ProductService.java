package com.example.asifEcommece.Service;

import com.example.asifEcommece.Exception.SellerNotFoundException;
import com.example.asifEcommece.Model.Product;
import com.example.asifEcommece.Model.Seller;
import com.example.asifEcommece.Repository_DAO.ProductRepository;
import com.example.asifEcommece.Repository_DAO.SellerRepository;
import com.example.asifEcommece.Transformer.ProductTransformer;
import com.example.asifEcommece.dto.Reponse.ProductResponce;
import com.example.asifEcommece.dto.Request.ProductRequest;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final SellerRepository sellerRepository;

    public ProductResponce addProduct(int sellerId, ProductRequest productRequest) {

        Optional<Seller>optionalSeller=sellerRepository.findById(sellerId);
        if(optionalSeller.isEmpty()){
            throw new SellerNotFoundException("this seller "+ sellerId + " id is not found ");
        }

        Seller seller = optionalSeller.get();

        Product product = ProductTransformer.productRequestToProduct(productRequest);

        product.setSeller(seller);

        Product savedProduct=productRepository.save(product);

        return ProductTransformer.productToProductResponse(savedProduct);

    }
}
