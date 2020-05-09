package com.learning.springboot.sda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class AppConfiguration {

    @Value("${red.car.color}")
    String redCarColor;
    @Value("${blue.car.color}")
    String blueCarColor;
    @Value("${black.car.color}")
    String blackCarColor;

    @Bean
    public Car masinaRosie(){
        return new Car(redCarColor);
    }

    @Bean
    public Car masinaAlbastra(){
        return new Car(blueCarColor);
    }

    @Bean
    public Car masinaNeagra(){
        return new Car(blackCarColor);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
