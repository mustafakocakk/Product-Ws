package com.product.ws.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.ws.model.objProcess.dto.ObjProcessDTO;
import com.product.ws.model.objProcess.entity.ObjProcess;
import com.product.ws.repository.BaseRepository;
import com.product.ws.repository.objProcess.ObjProcessRepository;
import com.product.ws.repository.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ObjProcessService extends BaseService<ObjProcess, ObjProcessDTO>{

    private final ObjProcessRepository objProcessRepository;

    protected static final ObjectMapper objectMapper = new ObjectMapper();
    protected ObjProcessService(BaseRepository<ObjProcess> baseRepo, ObjProcessRepository objProcessRepository) {
        super(baseRepo);
        this.objProcessRepository = objProcessRepository;
    }
}
