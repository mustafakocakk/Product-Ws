package com.product.ws.model.product.dto;

import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.product.ProductDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO  extends BaseModelDTO {
    private String summaryPrice;
    private List<ProductDetail> productDetails;
    private ClientDTO client;

}
