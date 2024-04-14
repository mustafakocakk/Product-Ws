package com.product.ws.model.clients.dto;

import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientsDTO extends BaseModelDTO {

    private String name;

    private String location;

    private String phone;
}
