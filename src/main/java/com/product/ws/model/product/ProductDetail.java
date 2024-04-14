package com.product.ws.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDetail {

    private String categoryName;
    private String unitPrice;
    private String weight;
    private String summaryPrice;
}
