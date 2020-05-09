package com.learning.springboot.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Car masinaRosie(){
        return new Car("rosieDinAnotare");
    }

    @Bean
    public Car masinaAlbastra(){
        return new Car("albastraDinAnotare");
    }

    @Bean
    public Car masinaNeagra(){
        return new Car("neagraDinAnotare");
    }

}
