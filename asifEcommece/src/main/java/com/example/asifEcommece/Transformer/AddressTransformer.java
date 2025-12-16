package com.example.asifEcommece.Transformer;

import com.example.asifEcommece.Model.Address;
import com.example.asifEcommece.dto.Reponse.AddressResponse;
import com.example.asifEcommece.dto.Request.AddressRequest;

public class AddressTransformer {

    public static Address addressRequestToAddress(AddressRequest addressRequest){
        return Address.builder()
                .houseNo(addressRequest.getHouseNo())
                .city(addressRequest.getCity())
                .state(addressRequest.getState())
                .pinCode(addressRequest.getPinCode())
                .build();
    }

    public static AddressResponse addressToAddressResponce(Address address){
        return AddressResponse.builder()
                .houseNo(address.getHouseNo())
                .city(address.getCity())
                .state(address.getState())
                .pinCode(address.getPinCode())
                .customer(CustomerTransformer.customerToCustomerResponce(address.getCustomer()))
                .build();
    }

}
