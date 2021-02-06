package com.sharmarajdaksh.StarterProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student student1 = new Student(
                    "Dakshraj",
                    "sharmarajdaksh@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 18)
            );
            Student student2 = new Student(
                    "Manikraj",
                    "manikrajsharma@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 8)
            );

            studentRepository.saveAll(List.of(student1, student2));
        };
    }
}
