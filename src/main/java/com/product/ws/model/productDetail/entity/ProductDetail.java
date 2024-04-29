package com.product.ws.model.productDetail.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.client.entity.Client;
import com.product.ws.model.productTransaction.entity.ProductTransaction;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "product_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends BaseModel implements Serializable {

    @Column(name = "product_name", nullable = false, updatable = false)
    private String productName;

    @Column(name = "category_name", nullable = false, updatable = false)
    private String categoryName;

    @Column(name = "unit_price", nullable = false, updatable = false)
    private String unitPrice;

    @Column(name = "weight", nullable = false, updatable = false)
    private String weight;

    @Column(name = "price", nullable = false, updatable = false)
    private String price;

    @JsonIgnoreProperties("productDetails")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductTransaction.class, cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_transaction_id")
    private ProductTransaction productTransaction;
}
