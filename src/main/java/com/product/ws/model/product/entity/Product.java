package com.product.ws.model.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.product.ws.enums.ObjProcessorType;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.clients.entity.Clients;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel {


    @Column(name = "type",nullable = false,updatable = false)
    private ObjProcessorType productType;


    @Column(name = "summary_price",nullable = false,updatable = false)
    private String summaryPrice;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", nullable = false)
    private Clients clients;
}
