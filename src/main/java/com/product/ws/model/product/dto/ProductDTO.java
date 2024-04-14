package com.product.ws.model.product.dto;

import com.product.ws.enums.ObjProcessorType;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.clients.dto.ClientsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO  extends BaseModelDTO {
    private ObjProcessorType productType;
    private String summaryPrice;
    private ClientsDTO clients;

}
