package com.kamillooto.springbootexcelexport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {
    @Bean
    CommandLineRunner commandLineRunner(CourseRepository repository) {
        return args -> {
            Course java = new Course(
                    1,
                    "Java",
                    3000.0
            );
            Course phyton = new Course(
                    2,
                    "Phyton",
                    2000.0
            );
            Course devOps = new Course(
                    3,
                    "DevOps",
                    4000.0
            );
            Course angular = new Course(
                    4,
                    "Agular",
                    2000.0
            );
            repository.saveAll(
                    List.of(java, phyton, devOps, angular)
            );
        };
    }
}
