package com.rollerspeed.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenApi()
                .info(new Info()
                        .title("Roller Speed API")
                        .version("1.0")
                        .description("API para la gestión de la escuela de patinaje Roller Speed"));
    }
}
