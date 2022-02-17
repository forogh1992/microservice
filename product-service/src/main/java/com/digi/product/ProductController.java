package com.digi.product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product-list")

public class ProductController {

    @Autowired
    InventoryCheckClient inventoryCheckClient;

    private final String PRODUCT_SERVICE = "productService";

    @GetMapping(value = "/inventory-check")
    @CircuitBreaker(name = PRODUCT_SERVICE, fallbackMethod = "productFallback")
    public ResponseEntity<String> hi() {

        String response = inventoryCheckClient.hiInventoryService();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<String> productFallback(Exception e) {
        return new ResponseEntity<String>("inventory service is down, this is alternative service", HttpStatus.OK);

    }
}







