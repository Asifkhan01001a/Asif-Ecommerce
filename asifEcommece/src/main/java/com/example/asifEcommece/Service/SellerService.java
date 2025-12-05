package com.example.asifEcommece.Service;

import com.example.asifEcommece.Model.Seller;
import com.example.asifEcommece.Repository_DAO.SellerRepository;
import com.example.asifEcommece.Transformer.SellerTransformer;
import com.example.asifEcommece.dto.Reponse.SellerResponse;
import com.example.asifEcommece.dto.Request.SellerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;


    public SellerResponse addSeller(SellerRequest sellerRequest) {

        //step 1
        Seller seller= SellerTransformer.sellerRequestToSeller(sellerRequest);

        //step 2
        Seller saveSeller=sellerRepository.save(seller);

        //step 3
        return SellerTransformer.sellerToSellerResponce(saveSeller);

    }
}
