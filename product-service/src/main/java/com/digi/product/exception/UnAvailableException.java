package com.digi.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
public class UnAvailableException extends RuntimeException {
    public UnAvailableException(String message) {
        super(message);
    }
}
