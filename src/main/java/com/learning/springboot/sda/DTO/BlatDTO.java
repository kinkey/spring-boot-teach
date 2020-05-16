package com.learning.springboot.sda.DTO;

public class BlatDTO {

    String type;
    String marimeBlat;

    public BlatDTO(String type, String marimeBlat) {
        this.type = type;
        this.marimeBlat = marimeBlat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarimeBlat() {
        return marimeBlat;
    }

    public void setMarimeBlat(String marimeBlat) {
        this.marimeBlat = marimeBlat;
    }
}
