package com.product.ws.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.repository.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<Product, ProductDTO> {
    private final ProductRepository productRepository;

    protected static final ObjectMapper objectMapper = new ObjectMapper();

    public ProductService(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }


}
