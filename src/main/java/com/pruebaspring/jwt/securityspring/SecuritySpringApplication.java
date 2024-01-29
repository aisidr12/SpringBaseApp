package com.pruebaspring.jwt.securityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SecuritySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecuritySpringApplication.class, args);
    }

}
