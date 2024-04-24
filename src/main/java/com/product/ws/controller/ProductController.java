package com.product.ws.controller;

import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${context-path}/product")
public class ProductController extends BaseController<Product, ProductDTO> {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        super(productService);
        this.productService = productService;
    }


}
