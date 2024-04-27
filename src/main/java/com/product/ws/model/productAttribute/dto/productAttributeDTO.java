package com.product.ws.model.productAttribute.dto;

import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class productAttributeDTO extends BaseModelDTO {
    private String productType;

    private String productValue;

    private String parentType;
}
