package com.product.ws.model.productTransaction.dto;

import com.product.ws.enums.TransactionType;
import com.product.ws.model.base.BaseModelDTO;
import com.product.ws.model.client.dto.ClientDTO;
import com.product.ws.model.payment.dto.PaymentDTO;
import com.product.ws.model.productDetail.dto.ProductDetailDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTransactionDTO extends BaseModelDTO {
    private String totalPrice;

    private TransactionType transactionType;

    private List<ProductDetailDTO> productDetails;
    private ClientDTO client;
    private List<PaymentDTO> paymentList;
}
