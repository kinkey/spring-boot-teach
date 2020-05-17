package com.learning.springboot.sda.DTO;

public class PizzaOrderItemDTO {

    public String pizzaName;
    public int quantity = 1;
    public boolean extraMozzarella = false;
    public String blat = "normal";

    @Override
    public String toString() {
        return "PizzaOrderItemDTO{" +
                "pizzaName='" + pizzaName + '\'' +
                ", quantity=" + quantity +
                ", extraMozzarella=" + extraMozzarella +
                ", blat='" + blat + '\'' +
                '}';
    }
}
