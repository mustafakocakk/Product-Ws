package com.product.ws.service;

import com.product.ws.model.clients.dto.ClientsDTO;
import com.product.ws.model.clients.entity.Clients;
import com.product.ws.repository.BaseRepository;
import com.product.ws.repository.clients.ClientsRepository;
import org.springframework.stereotype.Service;


@Service
public class ClientsService  extends BaseService<Clients, ClientsDTO>{

    private final ClientsRepository clientsRepository;
    protected ClientsService(BaseRepository<Clients> baseRepo, ClientsRepository clientsRepository) {
        super(baseRepo);
        this.clientsRepository = clientsRepository;
    }
}
