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

        Car masinaRosie = context.getBean("masinaRosie", Car.class);
        Car masinaAlbastra = context.getBean("masinaAlbastra", Car.class);

        System.out.println(masinaRosie);
        System.out.println(masinaAlbastra);
    }
}