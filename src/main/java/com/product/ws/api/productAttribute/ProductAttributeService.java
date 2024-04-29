package com.product.ws.api.productAttribute;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.ws.model.productAttribute.dto.productAttributeDTO;
import com.product.ws.model.productAttribute.entity.ProductAttribute;
import com.product.ws.api.base.BaseRepository;
import com.product.ws.api.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductAttributeService extends BaseService<ProductAttribute, productAttributeDTO> {

    private final ProductAttributeRepository objProcessRepository;

    protected static final ObjectMapper objectMapper = new ObjectMapper();
    protected ProductAttributeService(BaseRepository<ProductAttribute> baseRepo, ProductAttributeRepository objProcessRepository) {
        super(baseRepo);
        this.objProcessRepository = objProcessRepository;
    }
}
