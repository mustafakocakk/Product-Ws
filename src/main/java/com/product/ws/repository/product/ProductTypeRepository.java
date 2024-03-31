package com.product.ws.repository.product;

import com.product.ws.model.product.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductTypeRepository extends JpaRepository<ProductType, UUID> {
}
