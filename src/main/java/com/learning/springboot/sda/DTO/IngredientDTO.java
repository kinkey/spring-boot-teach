package com.learning.springboot.sda.DTO;

public class IngredientDTO {
    String nume;
    Integer cantitate;

    public IngredientDTO(String nume, Integer cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getCantitate() {
        return cantitate;
    }

    public void setCantitate(Integer cantitate) {
        this.cantitate = cantitate;
    }
}
