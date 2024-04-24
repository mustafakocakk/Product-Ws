package com.product.ws.model.client.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.product.ws.model.base.BaseModel;
import com.product.ws.model.product.entity.Product;
import jakarta.persistence.*;
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

    @Column(name = "location",nullable = false,updatable = false)
    private String location;

    @Column(name = "phone",nullable = false,updatable = false)
    private String phone;

    @JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL)
    private List<Product> productList;


}
