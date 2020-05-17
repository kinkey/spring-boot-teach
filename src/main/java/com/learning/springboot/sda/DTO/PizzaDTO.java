package com.learning.springboot.sda.DTO;

import java.util.List;

public class PizzaDTO {

    String name;
    String extraMozzarella;
    String blat;
    List<IngredientDTO> ingrediente;

    public PizzaDTO(String name, String type, String blat, List<IngredientDTO> ingrediente) {
        this.name = name;
        this.extraMozzarella = type;
        this.blat = blat;
        this.ingrediente = ingrediente;
    }

    public PizzaDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtraMozzarella() {
        return extraMozzarella;
    }

    public void setExtraMozzarella(String extraMozzarella) {
        this.extraMozzarella = extraMozzarella;
    }

    public String getBlat() {
        return blat;
    }

    public void setBlat(String blat) {
        this.blat = blat;
    }

    public List<IngredientDTO> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<IngredientDTO> ingrediente) {
        this.ingrediente = ingrediente;
    }
}
