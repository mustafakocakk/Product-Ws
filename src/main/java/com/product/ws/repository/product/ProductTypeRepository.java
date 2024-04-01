package com.product.ws.repository.product;

import com.product.ws.model.product.dto.ProductTypeDTO;
import com.product.ws.model.product.entity.ProductType;
import com.product.ws.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductTypeRepository   extends BaseRepository<ProductType> {
}
