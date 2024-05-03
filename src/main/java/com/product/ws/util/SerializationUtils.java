package com.product.ws.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.hibernate.internal.util.SerializationHelper;

import java.io.Serializable;

public class SerializationUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


    }

    public static <T> T clone(Class<T> clazz, T dtls) {
        T clonedObject = (T) SerializationHelper.clone((Serializable) dtls);
        return clonedObject;
    }
    public static ObjectMapper getMapper(){
        return objectMapper;
    }

}
