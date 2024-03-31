package com.product.ws.controller;

import com.product.ws.model.product.dto.ProductTypeDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "${context-path}/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/test")
    ResponseEntity<List<Product>> createUser() {

        return ResponseEntity.ok(productService.list());
    }
    @PostMapping("/type")
    ResponseEntity<ProductTypeDTO> addProductType(@RequestBody ProductTypeDTO productTypeDTO) {

        return ResponseEntity.ok(productService.addProductType(productTypeDTO));
    }
}
