package com.learning.springboot.sda.service;

import com.learning.springboot.sda.DTO.PizzaDTO;
import com.learning.springboot.sda.entity.Pizza;

public class PizzaEntityConverter implements
EntityConverter<Pizza, PizzaDTO> {

    @Override
    public PizzaDTO convertToDTO(Pizza pizza) {
        return null;
    }

    @Override
    public Pizza convertToEntity(PizzaDTO pizzaDTO) {
        return null;
    }
}
