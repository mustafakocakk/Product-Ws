package com.product.ws.model.product.dto;

import com.product.ws.model.category.dto.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private UUID id;
    private String name;
    private List<CategoryDTO> categoryDTOList;
}
