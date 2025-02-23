package com.test.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi dinosaursApi() {
        return GroupedOpenApi.builder()
                .group("dinosaurs")
                .packagesToScan("com.test.demo.com.test.controller")  // Ajusta el paquete de tus controladores
                .build();


    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API de Dinosaurios")
                        .description("API para gestionar dinosaurios")
                        .version("v1.0")
                );
    }
}