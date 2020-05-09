package com.learning.springboot.sda.tema;

import org.springframework.stereotype.Component;

@Component
public class FaxPrinter implements Printer{

    @Override
    public void print() {
        System.out.println(
                "Printing to a fax machine to send");
    }


}
