package com.example.asifEcommece.Transformer;

import com.example.asifEcommece.Model.Seller;
import com.example.asifEcommece.dto.Reponse.SellerResponse;
import com.example.asifEcommece.dto.Request.SellerRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SellerTransformer {

    public static SellerResponse sellerToSellerResponce(Seller seller){
        return SellerResponse.builder()
                .city(seller.getCity())
                .name(seller.getName())
                .createdAt(seller.getAtCreated())
                .build();
    }

    public static Seller sellerRequestToSeller(SellerRequest sellerRequest){
        return Seller.builder()
                .name(sellerRequest.getName())
                .city(sellerRequest.getCity())
                .panNo(sellerRequest.getPanNo())
                .build();
    }

}
