package com.product.ws.exception;

import com.product.ws.model.base.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    ResponseEntity<Object> handleException(Exception exception, HttpServletRequest httpServletRequest) {
        int statusCode = 400;
        if (exception instanceof AccessDeniedException)
            statusCode = 403;



        return ResponseEntity.status(statusCode).body(
                GenericResponse.error(exception.getMessage()));

    }
}