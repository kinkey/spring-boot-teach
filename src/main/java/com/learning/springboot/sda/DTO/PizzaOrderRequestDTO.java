package com.learning.springboot.sda.DTO;

import java.util.List;

public class PizzaOrderRequestDTO {
    public String orderPersonName;
    public List<PizzaOrderItemDTO> orderItems;

    @Override
    public String toString() {
        return "PizzaOrderRequestDTO{" +
                "orderPersonName='" + orderPersonName + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
