package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student anatolie = new Student(

                    "Anatolie",
                    "anatolie.molosag94@gmail.com",
                    LocalDate.of(1994, Month.JANUARY,23)
            );

            Student alex = new Student(

                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1984, Month.JANUARY,25)
            );
            repository.saveAll(
                    List.of(anatolie,alex)
            );
        };
    }
}
