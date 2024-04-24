package com.product.ws.model.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.client.entity.Client;
import com.product.ws.model.product.ProductDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel implements Serializable {

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "product_details", columnDefinition = "jsonb")
    private List<ProductDetail> productDetails;


    @Column(name = "summary_price",nullable = false,updatable = false)
    private String summaryPrice;

    @JsonIgnoreProperties("productList")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Client.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "client_id")
    private Client client;
}
