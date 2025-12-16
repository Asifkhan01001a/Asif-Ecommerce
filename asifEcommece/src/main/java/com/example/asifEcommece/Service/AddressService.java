package com.example.asifEcommece.Service;

import com.example.asifEcommece.Exception.AddressNotFoundException;
import com.example.asifEcommece.Exception.CustomerNotFoundException;
import com.example.asifEcommece.Model.Address;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Repository_DAO.AddressRepository;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import com.example.asifEcommece.Transformer.AddressTransformer;
import com.example.asifEcommece.dto.Reponse.AddressResponse;
import com.example.asifEcommece.dto.Request.AddressRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class AddressService {

    private final AddressRepository addressRepository;

    private final CustomerRepository customerRepository;


    public AddressResponse addAddress(int customerId, AddressRequest addressRequest) {
        Optional<Customer>optionalCustomer=customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("invalid customer " + customerId + " id");
        }

        Customer customer=optionalCustomer.get();
        Address address = AddressTransformer.addressRequestToAddress(addressRequest);
        address.setCustomer(customer);
        Address savedAddress=addressRepository.save(address);
        return AddressTransformer.addressToAddressResponce(savedAddress);
    }
}
