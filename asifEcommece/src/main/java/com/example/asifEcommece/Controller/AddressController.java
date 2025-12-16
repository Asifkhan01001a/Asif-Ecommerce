package com.example.asifEcommece.Controller;


import com.example.asifEcommece.Repository_DAO.AddressRepository;
import com.example.asifEcommece.Service.AddressService;
import com.example.asifEcommece.dto.Request.AddressRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public ResponseEntity addAddress(@RequestParam("c-id") int customerId,
                                     @RequestBody AddressRequest addressRequest){
        try{
            return new ResponseEntity(addressService.addAddress(customerId,addressRequest), HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }


    }

}
