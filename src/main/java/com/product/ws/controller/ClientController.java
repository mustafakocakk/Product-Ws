package com.product.ws.controller;

import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.client.entity.Client;
import com.product.ws.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${context-path}/client")
public class ClientController extends BaseController<Client, ClientDTO> {
    public ClientController(BaseService<Client, ClientDTO> service) {
        super(service);
    }
}
