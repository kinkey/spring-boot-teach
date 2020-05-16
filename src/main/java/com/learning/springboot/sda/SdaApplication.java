package com.learning.springboot.sda;

import com.learning.springboot.sda.service.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SdaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SdaApplication.class, args);


    }
}