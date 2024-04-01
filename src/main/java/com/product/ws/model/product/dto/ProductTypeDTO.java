package com.product.ws.model.product.dto;

import com.product.ws.model.base.BaseModel;
import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTypeDTO  extends BaseModelDTO {
    private String name;
}
