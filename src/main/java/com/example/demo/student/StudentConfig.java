package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository) {
        return args -> {
            Student Asad = new Student(
                "Asad",
                "AsadAli@gmail.com",
                LocalDate.of(2003, Month.DECEMBER, 1)
            );

            Student Ali = new Student(
                "Ali",
                "AsadAli2@gmail.com",
                LocalDate.of(2004, Month.DECEMBER, 2) 
            );

            repository.saveAll(
                List.of(Asad, Ali)
            );
        };
    }
    
}
