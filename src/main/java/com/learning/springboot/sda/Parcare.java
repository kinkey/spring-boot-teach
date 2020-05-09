package com.learning.springboot.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Parcare {

    @Autowired
    private List<Car> carList;

    private Car masinaDinParcare;

    @Autowired
    @Qualifier("masinaNeagra")
    public void setMasinaDinParcare(Car masinaDinParcare)
    {
        this.masinaDinParcare = masinaDinParcare;
    }

    public Parcare(Car masinaDinParcare) {
        this.masinaDinParcare = masinaDinParcare;
    }

    public Parcare() {
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return "Parcare{" +
                "carList=" + carList +
                ", masinaDinParcare=" + masinaDinParcare +
                '}';
    }

}
