package com.learning.springboot.sda.service;

import com.learning.springboot.sda.DTO.BlatDTO;
import com.learning.springboot.sda.DTO.IngredientDTO;
import com.learning.springboot.sda.DTO.PizzaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {

    public PizzaDTO getPizza(String marime, String tipPizza, String tipBlat){
        if( (!"integrala".equals(tipBlat))){
            throw new IllegalStateException("Tip de blat invalid");
        }

        List<IngredientDTO> ingrediente= new ArrayList<>();

        if(tipPizza.equals("diavola")){
            ingrediente.add(new IngredientDTO("salam iute", 5));
            ingrediente.add(new IngredientDTO("peperoni", 10));
            ingrediente.add(new IngredientDTO("masline", 5));
            ingrediente.add(new IngredientDTO("branza", 2));
        }

        BlatDTO blat = new BlatDTO(tipBlat, marime);

        return new PizzaDTO("my awesome pizza", tipPizza, blat, ingrediente);
    }
}
