package com.learning.springboot.sda.controller;

import com.learning.springboot.sda.DTO.PizzaDTO;
import com.learning.springboot.sda.DTO.PizzaOrderRequestDTO;
import com.learning.springboot.sda.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaController {

    @Autowired
    PizzaService pizzaService;

    @GetMapping(value = "/pizza", produces = "application/json")
    public ResponseEntity<List<PizzaDTO>> getValue(){

        List<PizzaDTO> allPizzas = pizzaService.getAllPizzas();


        return new ResponseEntity<List<PizzaDTO>>(allPizzas, HttpStatus.OK);
    }

    @PostMapping(value = "/pizza", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<PizzaDTO>> createPizza(@RequestBody  PizzaOrderRequestDTO orderRequest){
        System.out.println(orderRequest.toString());

        List<PizzaDTO> pizzaDTOS = pizzaService.savePizzas(orderRequest);

        return new ResponseEntity<List<PizzaDTO>>(pizzaDTOS, HttpStatus.OK);
    }

    @GetMapping(value = "/hw", produces = "application/json")
    public ResponseEntity<String> getValue22(){




        return new ResponseEntity<String>("HELLO WORLD", HttpStatus.OK);
    }


}
