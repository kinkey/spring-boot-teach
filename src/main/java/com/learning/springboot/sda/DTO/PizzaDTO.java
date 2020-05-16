package com.learning.springboot.sda.DTO;

import java.util.List;

public class PizzaDTO {

    String name;
    String type;
    BlatDTO blat;
    List<IngredientDTO> ingrediente;

    public PizzaDTO(String name, String type, BlatDTO blat, List<IngredientDTO> ingrediente) {
        this.name = name;
        this.type = type;
        this.blat = blat;
        this.ingrediente = ingrediente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BlatDTO getBlat() {
        return blat;
    }

    public void setBlat(BlatDTO blat) {
        this.blat = blat;
    }

    public List<IngredientDTO> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<IngredientDTO> ingrediente) {
        this.ingrediente = ingrediente;
    }
}
