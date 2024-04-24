package com.product.ws.service;

import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.client.entity.Client;
import com.product.ws.repository.BaseRepository;
import com.product.ws.repository.client.ClientRepository;
import org.springframework.stereotype.Service;


@Service
public class ClientService extends BaseService<Client, ClientDTO> {

    private final ClientRepository clientRepository;

    protected ClientService(BaseRepository<Client> baseRepo, ClientRepository clientRepository) {
        super(baseRepo);
        this.clientRepository = clientRepository;
    }
}
