package com.product.ws.model.base;

import java.util.UUID;

public interface WithIDEntity {
    UUID getId();
    void setId(UUID id);
}
