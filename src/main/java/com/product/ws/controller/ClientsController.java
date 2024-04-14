package com.product.ws.controller;

import com.product.ws.model.clients.dto.ClientsDTO;
import com.product.ws.model.clients.entity.Clients;
import com.product.ws.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${context-path}/clients")
public class ClientsController extends BaseController<Clients, ClientsDTO> {
    public ClientsController(BaseService<Clients, ClientsDTO> service) {
        super(service);
    }
}
