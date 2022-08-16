package com.sparta.spring_week03_homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringWeek03HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWeek03HomeworkApplication.class, args);
    }

}
