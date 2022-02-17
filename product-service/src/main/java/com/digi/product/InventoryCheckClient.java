package com.digi.product;


import com.digi.product.common.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "inventory", url = "http://localhost:8080/inventoryservice/inventory/", configuration = FeignConfig.class)

public interface InventoryCheckClient {

    @GetMapping(value = "/check-list")
    String hiInventoryService();

}
