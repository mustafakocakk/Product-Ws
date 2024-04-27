package com.product.ws.model.client.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.payment.entity.Payment;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends BaseModel {
    @Column(name = "name",nullable = false,updatable = false)
    private String name;

    @Column(name = "surname",nullable = false,updatable = false)
    private String surname;

    @Column(name = "location",updatable = false)
    private String location;

    @Column(name = "phone",nullable = false,updatable = false)
    private String phone;

    @Column(name = "balance",updatable = false)
    private String balance;

    @JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
    private List<ProductTransaction> productTransactionList;

    @JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Payment> paymentList;




}
