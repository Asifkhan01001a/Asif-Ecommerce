package com.example.asifEcommece.Service;

import com.example.asifEcommece.Exception.CustomerNotFoundException;
import com.example.asifEcommece.Exception.ProductNotFoundException;
import com.example.asifEcommece.Model.Customer;
import com.example.asifEcommece.Model.OrderEntity;
import com.example.asifEcommece.Model.Product;
import com.example.asifEcommece.Repository_DAO.CustomerRepository;
import com.example.asifEcommece.Repository_DAO.OrderRepository;
import com.example.asifEcommece.Repository_DAO.ProductRepository;
import com.example.asifEcommece.Transformer.OrderTransformer;
import com.example.asifEcommece.dto.Reponse.OrderResponce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.example.asifEcommece.Enum.OrderStatus.PLACED;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;



    public OrderResponce placeOrder(int customerId, int productId) {

        Optional<Customer>optionalCustomer=customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()){
            throw new CustomerNotFoundException("this "+customerId+" id customer is not found ");
        }
        Optional<Product>optionalProduct=productRepository.findById(productId);
        if(optionalProduct.isEmpty()){
            throw new ProductNotFoundException("this "+productId+" id product is not found ");
        }

        Customer customer=optionalCustomer.get();
        Product product=optionalProduct.get();

        OrderEntity order = new OrderEntity();
        order.setOrderStatus(PLACED);
        order.setValue(product.getPrice());
        order.setCustomer(customer);
        order.getProducts().add(product);

        OrderEntity savedOrder=orderRepository.save(order);

        return OrderTransformer.orderToOrderResponce(savedOrder);
    }
}
