package com.product.ws.model.stock.entity;

import com.product.ws.model.base.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;



@Entity
@Table(name = "stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock extends BaseModel implements Serializable {
    @Column(name = "prod_name", nullable = false, updatable = false)
    private String prodName;

    @Column(name = "category_name", nullable = false, updatable = false)
    private String categoryName;

    @Column(name = "weight", nullable = false, updatable = false)
    private String weight;
}
