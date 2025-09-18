package com.url.shortener.security;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Url Shortener Application")
                        .description("This Project is Developed by OM_PATIL")
                        .version("1.0")
                        .termsOfService("Terms & Conditions")
                        .contact(new Contact()
                                .name("Om")
                                .url("http://urlshortnerbyom.com")
                                .email("omp503745@gmail.com")
                        )
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("License of APIs")
                                .url("API license URL")
                        )
                );
    }
}
