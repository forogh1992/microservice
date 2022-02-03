package com.digi.gatway;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/inventoryservice/**")
                        .uri("lb://inventory-service")
                )

                .route(r -> r.path("/proservice/**")
                        .uri("lb://product-service")
                )
                .build();
    }

}