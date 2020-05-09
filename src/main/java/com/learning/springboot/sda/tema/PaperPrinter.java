package com.learning.springboot.sda.tema;

import org.springframework.stereotype.Component;

@Component
public class PaperPrinter implements Printer {

    @Override
    public void print() {
        System.out.println(
                "Printing the email to paper : ");
    }


}
