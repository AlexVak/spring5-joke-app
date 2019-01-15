package com.alexvak.spring5jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class Spring5jokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5jokeappApplication.class, args);
    }

}