package com.product.ws.controller;

import com.product.ws.model.base.BaseModel;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.dto.ProductTypeDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.service.BaseService;
import com.product.ws.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "${context-path}/product")
public class ProductController extends BaseController<Product, ProductDTO> {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        super(productService);
        this.productService = productService;
    }

    @RequestMapping(value = "/type",method = RequestMethod.PUT, produces = {"application/json"})
    ResponseEntity<ProductTypeDTO> addProductType(@RequestBody ProductTypeDTO productTypeDTO) {
        productService.addType(productTypeDTO);
        return ResponseEntity.ok(productTypeDTO);
    }

    @RequestMapping(value = "/type/list", method = RequestMethod.POST, produces = {"application/json"})
    ResponseEntity<List<ProductTypeDTO>> listAllProductType() {

        return ResponseEntity.ok(productService.listAllProductType());
    }

    @RequestMapping(value = "/type/{id}", method = RequestMethod.GET, produces = {"application/json"})
    ResponseEntity<ProductTypeDTO> getProductType(@PathVariable(name = "id") UUID id) {
        ProductTypeDTO productTypeDTO = productService.getProductType(id);
        return ResponseEntity.ok(productTypeDTO);
    }
}
