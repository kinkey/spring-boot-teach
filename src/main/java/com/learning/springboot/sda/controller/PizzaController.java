package com.learning.springboot.sda.controller;

import com.learning.springboot.sda.DTO.PizzaDTO;
import com.learning.springboot.sda.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    @GetMapping(value = "/omfg", produces = "application/json")
    public ResponseEntity<PizzaDTO> getValue(){

        PizzaDTO myPizza = pizzaService.getPizza("mare", "diavola",
                "integrala");



        return new ResponseEntity<>(myPizza, HttpStatus.OK);
    }
}
