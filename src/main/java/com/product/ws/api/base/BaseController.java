package com.product.ws.api.base;

import com.product.ws.model.base.BaseModel;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.base.GenericResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class BaseController<ENTITY extends BaseModel, DTO extends BaseModelDTO> {
    private final BaseService<ENTITY, DTO> service;

    public BaseController(BaseService<ENTITY, DTO> service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.PUT, produces = {"application/json"})
    public GenericResponse<DTO> insert(@RequestBody DTO dto) {

        service.save(dto);
        return  GenericResponse.success(dto);
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = {"application/json"})
    public GenericResponse<List<DTO>> listAll() {

        List<DTO> list=service.listAll();
        return  GenericResponse.success(list);
    }

    @RequestMapping(method = RequestMethod.POST, produces = {"application/json"})
    public GenericResponse<DTO> update(@RequestBody DTO dto) {

        service.edit(dto);
        return GenericResponse.success(dto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json"})
    public GenericResponse<DTO> delete(@PathVariable(name = "id") UUID id) {


        DTO dto = service.deleteById(id);
        return GenericResponse.success(dto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public GenericResponse<DTO> get(@PathVariable(name = "id") UUID id) {
        DTO dto = service.findModel(id);
        return GenericResponse.success(dto);
    }

}
