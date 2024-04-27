package com.product.ws.model.productDetail.dto;

import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailDTO extends BaseModelDTO {
    private String productName;
    private String categoryName;
    private String unitPrice;
    private String weight;
    private String summaryPrice;
}
