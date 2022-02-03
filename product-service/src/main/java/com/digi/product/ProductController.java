package com.digi.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product-list")

public class ProductController {

    @Autowired
    InventoryCheckClient inventoryCheckClient;

    @GetMapping(value = "/inventory-check")
    public String hi() {

        return  inventoryCheckClient.hiInventoryService();
    }

}







