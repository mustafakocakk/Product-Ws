package com.product.ws.api.client;

import com.product.ws.api.base.BaseRepository;
import com.product.ws.api.base.BaseService;
import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.client.entity.Client;
import org.springframework.stereotype.Service;


@Service
public class ClientService extends BaseService<Client, ClientDTO> {

    private final ClientRepository clientRepository;

    protected ClientService(BaseRepository<Client> baseRepo, ClientRepository clientRepository) {
        super(baseRepo);
        this.clientRepository = clientRepository;
    }
}