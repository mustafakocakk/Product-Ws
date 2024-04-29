package com.product.ws.api.productTransaction;

import com.product.ws.api.base.BaseRepository;
import com.product.ws.api.base.BaseService;
import com.product.ws.model.productAttribute.entity.ProductAttribute;
import com.product.ws.model.productTransaction.dto.ProductTransactionDTO;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import org.springframework.stereotype.Service;

@Service
public class ProductTransactionService extends BaseService<ProductTransaction, ProductTransactionDTO> {

    private final ProductTransactionRepository productTransactionRepository;

    protected ProductTransactionService(BaseRepository<ProductTransaction> baseRepo, ProductTransactionRepository productTransactionRepository) {
        super(baseRepo);
        this.productTransactionRepository = productTransactionRepository;
    }
}
