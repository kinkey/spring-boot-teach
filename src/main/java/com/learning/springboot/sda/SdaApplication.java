package com.learning.springboot.sda;

import com.learning.springboot.sda.tema.Email;
import com.learning.springboot.sda.tema.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SdaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SdaApplication.class, args);

        Email email =
                context.getBean("email", Email.class);

        email.printEmail();
      }
}