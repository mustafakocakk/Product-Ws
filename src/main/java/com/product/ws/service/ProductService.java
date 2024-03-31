package com.product.ws.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.ws.model.product.dto.ProductTypeDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.model.product.entity.ProductType;
import com.product.ws.repository.product.ProductRepository;
import com.product.ws.repository.product.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductTypeRepository productTypeRepository;
    protected static final ObjectMapper objectMapper = new ObjectMapper();

    public List<Product> list() {
        return  productRepository.findAll();
    }

    public ProductTypeDTO addProductType(ProductTypeDTO productTypeDTO) {
        ProductType productType = objectMapper.convertValue(productTypeDTO, ProductType.class);
        productType = productTypeRepository.save(productType);
        return objectMapper.convertValue(productType, ProductTypeDTO.class);
    }
}
