package com.product.ws.api.payment;

import com.product.ws.api.base.BaseController;
import com.product.ws.api.base.BaseService;
import com.product.ws.model.payment.dto.PaymentDTO;
import com.product.ws.model.payment.entity.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${context-path}/payment")
public class PaymentController extends BaseController<Payment, PaymentDTO> {
    public PaymentController(BaseService<Payment, PaymentDTO> service) {
        super(service);
    }
}
