package com.product.ws.api.stock;

import com.product.ws.api.base.BaseController;
import com.product.ws.model.stock.dto.StockDTO;
import com.product.ws.model.stock.entity.Stock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${context-path}/stock")
public class StockController extends BaseController<Stock, StockDTO> {
    private final StockService stockService;

    public StockController(StockService stockService) {
        super(stockService);
        this.stockService = stockService;
    }
}
