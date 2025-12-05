package com.example.asifEcommece.Controller;


import com.example.asifEcommece.Model.Seller;
import com.example.asifEcommece.Service.SellerService;
import com.example.asifEcommece.dto.Request.SellerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping
    public ResponseEntity addSeller(@RequestBody SellerRequest sellerRequest){
      return new ResponseEntity(sellerService.addSeller(sellerRequest), HttpStatus.CREATED);
    }


}
