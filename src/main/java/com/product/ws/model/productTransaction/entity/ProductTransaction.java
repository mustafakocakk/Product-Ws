package com.product.ws.model.productTransaction.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.enums.TransactionType;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.client.entity.Client;
import com.product.ws.model.payment.entity.Payment;
import com.product.ws.model.productDetail.entity.ProductDetail;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "product_transaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTransaction extends BaseModel implements Serializable {

    @Column(name = "total_price", nullable = false, updatable = false)
    private String totalPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type", nullable = false, updatable = false)
    private TransactionType transactionType;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "productTransaction", cascade = CascadeType.ALL)
    private List<ProductDetail> productDetails;

    @JsonIgnoreProperties("productTransactionList")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Client.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @JsonIgnoreProperties("productTransaction")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "productTransaction", cascade = CascadeType.ALL)
    private List<Payment> paymentList;
}
