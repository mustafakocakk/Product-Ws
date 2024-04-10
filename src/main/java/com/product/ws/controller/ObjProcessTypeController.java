package com.product.ws.controller;

import com.product.ws.model.category.entity.Category;
import com.product.ws.model.objProcess.dto.ObjProcessDTO;
import com.product.ws.model.objProcess.entity.ObjProcess;
import com.product.ws.model.product.dto.ProductDTO;
import com.product.ws.model.product.entity.Product;
import com.product.ws.service.BaseService;
import com.product.ws.service.ObjProcessService;
import com.product.ws.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${context-path}/obj")
public class ObjProcessTypeController  extends BaseController<ObjProcess, ObjProcessDTO>   {
    private final ObjProcessService objProcessService;

    public ObjProcessTypeController(ObjProcessService objProcessService) {
        super(objProcessService);
        this.objProcessService = objProcessService;
    }
}
