package com.product.ws.api.productTransaction;

import com.product.ws.api.base.BaseController;
import com.product.ws.model.productTransaction.dto.ProductTransactionDTO;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${context-path}/transaction")
public class ProductTransactionController extends BaseController<ProductTransaction, ProductTransactionDTO> {
    private final ProductTransactionService productTransactionService;

    public ProductTransactionController(ProductTransactionService productTransactionService) {
        super(productTransactionService);
        this.productTransactionService = productTransactionService;
    }
}
