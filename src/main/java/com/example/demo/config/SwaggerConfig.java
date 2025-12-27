package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // You need to change the port as per your server
                .servers(List.of(
                        new Server().url("https://9157.pro604cr.amypo.ai/")
                ));
        }
}



// package com.example.demo.config;

// import io.swagger.v3.oas.models.Components;
// import io.swagger.v3.oas.models.OpenAPI;
// import io.swagger.v3.oas.models.info.Info;
// import io.swagger.v3.oas.models.security.SecurityRequirement;
// import io.swagger.v3.oas.models.security.SecurityScheme;
// import io.swagger.v3.oas.models.servers.Server;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import java.util.List;

// @Configuration
// public class SwaggerConfig {

//     @Bean
//     public OpenAPI customOpenAPI() {
//         return new OpenAPI()
//                 .info(new Info().title("Drug Interaction Checker API").version("1.0"))
//                 // Adds the "Authorize" button to Swagger UI
//                 .addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
//                 .components(new Components().addSecuritySchemes("Bearer Authentication", createSecurityScheme()))
//                 .servers(List.of(
//                         new Server().url("https://9157.pro604cr.amypo.ai/")
//                 ));
//     }

//     private SecurityScheme createSecurityScheme() {
//         return new SecurityScheme()
//                 .name("Bearer Authentication")
//                 .type(SecurityScheme.Type.HTTP)
//                 .scheme("bearer")
//                 .bearerFormat("JWT");
//     }
// }
