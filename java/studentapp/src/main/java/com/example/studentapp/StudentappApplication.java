package com.example.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.studentapp")
@EnableJpaRepositories("com.example.studentapp.repository")
public class StudentappApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentappApplication.class, args);
    }
}