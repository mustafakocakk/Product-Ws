package com.product.ws.api.payment;

import com.product.ws.api.base.BaseRepository;
import com.product.ws.api.base.BaseService;
import com.product.ws.model.payment.dto.PaymentDTO;
import com.product.ws.model.payment.entity.Payment;
import org.springframework.stereotype.Service;


@Service
public class PaymentService extends BaseService<Payment, PaymentDTO> {

    private final PaymentRepository paymentRepository;

    protected PaymentService(BaseRepository<Payment> baseRepo, PaymentRepository paymentRepository) {
        super(baseRepo);
        this.paymentRepository = paymentRepository;
    }
}
