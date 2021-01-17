package es.caib.notib.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotibmsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotibmsGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//
//        return builder.routes()
//                .route("entitat-service",
//                        r -> r.path("/api/v1/entitat/*")
//                                .uri("lb://entitat-service")
//                )
//                .build();
//
//    }
}
