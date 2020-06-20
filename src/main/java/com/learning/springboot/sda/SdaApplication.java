package com.learning.springboot.sda;

import com.learning.springboot.sda.service.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SdaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SdaApplication.class, args);


    }

}