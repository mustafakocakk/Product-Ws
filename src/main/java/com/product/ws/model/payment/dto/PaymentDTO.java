package com.product.ws.model.payment.dto;


import com.product.ws.enums.PaymentType;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.client.entity.Client;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO extends BaseModelDTO {

    private String paymentValue;

    private PaymentType paymentType;

    private ProductTransaction productTransaction;

    private Client client;
}
