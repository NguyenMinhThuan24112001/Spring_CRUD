package com.example.crud_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudFirstApplication {

    public static void main(String[] args) {

        SpringApplication.run(CrudFirstApplication.class, args);
    }

}
