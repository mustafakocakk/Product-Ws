package com.product.ws.model.payment.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.enums.PaymentType;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.client.entity.Client;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "payment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends BaseModel implements Serializable {



    @Column(name = "payment_value", nullable = false, updatable = false)
    private String paymentValue;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type", nullable = false, updatable = false)
    private PaymentType paymentType;

    @JsonIgnoreProperties("paymentList")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductTransaction.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_transaction_id")
    private ProductTransaction productTransaction;

    @JsonIgnoreProperties("paymentList")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Client.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "client_id")
    private Client client;
}
