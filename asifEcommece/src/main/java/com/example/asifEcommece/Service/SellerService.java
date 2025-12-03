package com.example.asifEcommece.Service;

import com.example.asifEcommece.Model.Seller;
import com.example.asifEcommece.Repository_DAO.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;


    public Seller addSeller(Seller seller) {
        Seller addedSeller =  sellerRepository.save(seller);
        return addedSeller;
    }
}
