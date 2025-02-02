package com.yowyob.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r
                        .path("/api/users/**")
                        .uri("lb://user-service"))

                .route("blog-service", r -> r
                        .path("/api/blogs/**")
                        .uri("lb://blog-service"))

                .route("podcast-service", r -> r
                        .path("/api/podcasts/**")
                        .uri("lb://podcast-service"))

                .route("notification-service", r -> r
                        .path("/api/notifications/**")
                        .uri("lb://notification-service"))

                .route("newsletter-service", r -> r
                        .path("/api/newsletters/**")
                        .uri("lb://newsletter-service"))
                .build();
    }
}