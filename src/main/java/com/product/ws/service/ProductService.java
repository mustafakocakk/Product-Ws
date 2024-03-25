package com.product.ws.service;

import com.product.ws.model.Product;
import com.product.ws.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> list() {
        return  productRepository.findAll();
    }
}
