package com.product.ws.model.objProcess.dto;

import com.product.ws.model.base.BaseModelDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjProcessDTO extends BaseModelDTO {
    String type;
    String value;

}
