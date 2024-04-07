package com.product.ws.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.dto.ProductTypeDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.model.product.entity.ProductType;
import com.product.ws.repository.product.ProductRepository;
import com.product.ws.repository.product.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService extends BaseService<Product, ProductDTO> {
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;

    protected static final ObjectMapper objectMapper = new ObjectMapper();

    public ProductService(ProductRepository productRepository, ProductTypeRepository productTypeRepository) {
        super(productRepository);
        this.productRepository = productRepository;
        this.productTypeRepository = productTypeRepository;
    }

    public List<Product> list() {
        return productRepository.findAll();
    }


    public void addType(ProductTypeDTO productTypeDTO) {
        ProductType productType = objectMapper.convertValue(productTypeDTO, ProductType.class);
        productTypeRepository.save(productType);
    }

    public ProductTypeDTO getProductType(UUID id) {
        Optional<ProductType> byId = productTypeRepository.findById(id);
        if (byId.isPresent())
            return objectMapper.convertValue(byId.get(), ProductTypeDTO.class);
        return null;
    }

    public List<ProductTypeDTO> listAllProductType() {
        List<ProductType> all = productTypeRepository.findAll();
        return objectMapper.convertValue(all,
                new TypeReference<>() {
                });
    }
}
