package com.digi.inventory;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inventory/")
public class InventoryController {

    @GetMapping(value = "/check-list")
    public String hiInventoryService() {
        return " inventory check service ";
    }

}

