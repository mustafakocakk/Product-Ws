package com.product.ws.model.objProcess.entity;

import com.product.ws.model.base.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "obj_process")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjProcess extends BaseModel {
    private String type;
    private String value;

}
