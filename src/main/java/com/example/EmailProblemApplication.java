package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailProblemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmailProblemApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        // no need to do anything as email connectionis being tested at startup
    }
}
