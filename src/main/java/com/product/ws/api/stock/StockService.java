package com.product.ws.api.stock;

import com.product.ws.api.base.BaseRepository;
import com.product.ws.api.base.BaseService;
import com.product.ws.model.stock.dto.StockDTO;
import com.product.ws.model.stock.entity.Stock;
import org.springframework.stereotype.Service;

@Service
public class StockService extends BaseService<Stock, StockDTO> {

    private final StockRepository stockRepository;

    protected StockService(BaseRepository<Stock> baseRepo, StockRepository stockRepository) {
        super(baseRepo);
        this.stockRepository = stockRepository;
    }
}
