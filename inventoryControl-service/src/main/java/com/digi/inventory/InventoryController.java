package com.digi.inventory;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inventory/")
public class InventoryController {

    @GetMapping(value = "/check-list")
    public ResponseEntity<String> hiInventoryService() {
        return new ResponseEntity<>(" inventory check service ", HttpStatus.OK);
    }

}

