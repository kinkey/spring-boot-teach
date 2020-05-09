package com.learning.springboot.sda.tema;

import org.springframework.stereotype.Component;

@Component
public class PapyrusPrinter implements Printer {

    @Override
    public void print() {
        System.out.println(
                "Printing the email on a papyrus");
    }


}
