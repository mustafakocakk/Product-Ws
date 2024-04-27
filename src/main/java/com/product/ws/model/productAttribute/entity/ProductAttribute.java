package com.product.ws.model.productAttribute.entity;

import com.product.ws.model.base.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "product_attribute")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductAttribute extends BaseModel {


    @Column(name = "product_type", nullable = false, updatable = false)
    private String productType;

    @Column(name = "product_value", nullable = false, updatable = false)
    private String productValue;

    @Column(name = "parent_type")
    private String parentType;

}
