package com.product.ws.repository.product;

import com.product.ws.model.product.entity.Product;
import com.product.ws.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends BaseRepository<Product> {
}
