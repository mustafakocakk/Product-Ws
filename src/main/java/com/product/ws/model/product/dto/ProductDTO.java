package com.product.ws.model.product.dto;

import com.product.ws.enums.ObjProcessorType;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.category.dto.CategoryDTO;
import com.product.ws.model.clients.dto.ClientsDTO;
import com.product.ws.model.clients.entity.Clients;
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
public class ProductDTO  extends BaseModelDTO {
    private ObjProcessorType productType;
    private String summaryPrice;
    private ClientsDTO clients;

}
