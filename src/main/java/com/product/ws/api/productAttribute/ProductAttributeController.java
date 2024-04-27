package com.product.ws.api.productAttribute;

import com.product.ws.api.base.BaseController;
import com.product.ws.model.productAttribute.dto.productAttributeDTO;
import com.product.ws.model.productAttribute.entity.ProductAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${context-path}/attribute")
public class ProductAttributeController extends BaseController<ProductAttribute, productAttributeDTO> {
    private final ProductAttributeService objProcessService;

    public ProductAttributeController(ProductAttributeService objProcessService) {
        super(objProcessService);
        this.objProcessService = objProcessService;
    }
}
