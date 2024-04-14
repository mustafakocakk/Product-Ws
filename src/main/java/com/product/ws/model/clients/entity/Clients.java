package com.product.ws.model.clients.entity;

import com.product.ws.model.base.BaseModel;
import com.product.ws.model.product.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clients  extends BaseModel  {
    @Column(name = "name",nullable = false,updatable = false)
    private String name;

    @Column(name = "surname",nullable = false,updatable = false)
    private String surname;

    @Column(name = "location",nullable = false,updatable = false)
    private String location;

    @Column(name = "phone",nullable = false,updatable = false)
    private String phone;

    @OneToMany(mappedBy = "clients", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

}
