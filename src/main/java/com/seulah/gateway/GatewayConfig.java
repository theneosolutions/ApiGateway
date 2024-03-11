package com.seulah.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("user_service_route", r -> r
//                        .path("/api/v1/**")
//                        .filters(f -> f
//                                .addRequestHeader("Access-Control-Allow-Origin", "http://localhost:3000")
//                                .addRequestHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE")
//                                .addRequestHeader("Access-Control-Allow-Headers", "*")
//                                .addResponseHeader("Access-Control-Allow-Origin", "http://localhost:3000")
//                                .addResponseHeader("Access-Control-Allow-Credentials", "true")
//                        )
//                        .uri("lb://USER-SERVICE")
//                )
//                .build();
//    }


}
