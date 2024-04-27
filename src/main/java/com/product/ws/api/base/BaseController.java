package com.product.ws.api.base;

import com.product.ws.model.base.BaseModel;
import com.product.ws.model.base.BaseModelDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public DTO insert(@RequestBody DTO dto) {

        service.save(dto);
        return ResponseEntity.ok(dto).getBody();
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = {"application/json"})
    public List<DTO> listAll() {

        List<DTO> list=service.listAll();
        return ResponseEntity.ok(list).getBody();
    }

    @RequestMapping(method = RequestMethod.POST, produces = {"application/json"})
    public DTO update(@RequestBody DTO dto) {

        service.edit(dto);
        return ResponseEntity.ok(dto).getBody();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = {"application/json"})
    public DTO delete(@PathVariable(name = "id") UUID id) {


        DTO dto = service.deleteById(id);
        return ResponseEntity.ok(dto).getBody();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public DTO get(@PathVariable(name = "id") UUID id) {
        DTO dto = service.findModel(id);
        return ResponseEntity.ok(dto).getBody();
    }

}
