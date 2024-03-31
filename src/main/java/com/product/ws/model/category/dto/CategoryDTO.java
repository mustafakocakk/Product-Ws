package com.product.ws.model.category.dto;

import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.dto.ProductTypeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private UUID id;
    private String name;
    private ProductDTO productDTO;
}
