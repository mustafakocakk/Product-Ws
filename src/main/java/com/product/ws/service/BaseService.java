package com.product.ws.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.reflect.TypeToken;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.repository.BaseRepository;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.product.ws.service.ProductService.objectMapper;

public abstract class BaseService<Entity extends BaseModel, DTO extends BaseModelDTO> {
    protected final Class<Entity> entityClass;

    private final BaseRepository<Entity> baseRepo;


    protected BaseService(BaseRepository<Entity> baseRepo) {
        this.entityClass = getEntityClass();
        this.baseRepo = baseRepo;
    }

    public <Entity> Class<Entity> getEntityClass() {
        return (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public <DTO> Class<DTO> getDtoClass() {
        return (Class<DTO>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[1];
    }

    public DTO findModel(UUID id) {
        if (id == null)
            return null;
        Optional<Entity> referenceById = baseRepo.findById(id);
        if (referenceById.isPresent()) {

            return objectMapper.convertValue(referenceById.get(), getDtoClass());
        }
        return null;
    }

    public DTO save(DTO dto) {
        Entity data = objectMapper.convertValue(dto, getEntityClass());
        baseRepo.save(data);
        dto.setId(data.getId());
        return dto;
    }

    public DTO edit(DTO dto) {
        DTO model = findModel(dto.getId());
        if (model != null) {
            Entity modelUpdated = objectMapper.convertValue(dto, getEntityClass());
            baseRepo.saveAndFlush(modelUpdated);
            return dto;
        }
        return null;
    }

    public DTO deleteById(UUID id) {
        if (id == null) {

            System.out.println("hata");
            return null;
        }



        Optional<Entity> referenceById = baseRepo.findById(id);
        if (referenceById.isPresent()) {
            baseRepo.deleteById(id);
            return objectMapper.convertValue(referenceById.get(), getDtoClass());
        }
        return null;

    }

    public List<DTO> listAll() {
        List<Entity> all = baseRepo.findAll();
        return objectMapper.convertValue(all, objectMapper.getTypeFactory().constructCollectionType(List.class, getDtoClass()));




    }
}
