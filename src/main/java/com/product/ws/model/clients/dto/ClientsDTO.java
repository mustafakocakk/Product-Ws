package com.product.ws.model.clients.dto;

import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.clients.entity.Clients;
import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientsDTO extends BaseModelDTO {

    private String name;
    private String surname;

    private String location;

    private String phone;

    private List<ProductDTO> products;


}
