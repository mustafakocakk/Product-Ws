package com.product.ws.model.stock.dto;

import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockDTO extends BaseModelDTO {

    private String prodName;

    private String categoryName;

    private String weight;
}
