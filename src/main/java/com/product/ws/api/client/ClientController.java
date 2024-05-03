package com.product.ws.api.client;

import com.product.ws.api.base.BaseController;
import com.product.ws.model.base.GenericResponse;
import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.client.entity.Client;
import com.product.ws.api.base.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "${context-path}/client")
public class ClientController extends BaseController<Client, ClientDTO> {

    private final ClientService clientService;

    public ClientController(BaseService<Client, ClientDTO> service, ClientService clientService) {
        super(service);
        this.clientService = clientService;
    }


    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = {"application/json"})
    public GenericResponse<ClientDTO> test() {

        ClientDTO list=clientService.test();
        return  GenericResponse.success(list);
    }
}
