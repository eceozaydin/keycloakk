package com.keycloakk.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class KeycloakkApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakkApplication.class, args);
    }

}
