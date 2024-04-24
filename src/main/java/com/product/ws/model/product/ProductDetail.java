package com.product.ws.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail {
    private String productName;
    private String categoryName;
    private String unitPrice;
    private String weight;
    private String summaryPrice;
}
