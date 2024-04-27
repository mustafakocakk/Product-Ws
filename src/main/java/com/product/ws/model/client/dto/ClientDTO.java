package com.product.ws.model.client.dto;

import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.payment.dto.PaymentDTO;
import com.product.ws.model.productTransaction.dto.ProductTransactionDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO extends BaseModelDTO {

    private String name;
    private String surname;

    private String location;

    private String phone;
    private List<ProductTransactionDTO> productTransactionList;

    private List<PaymentDTO> paymentList;



}
