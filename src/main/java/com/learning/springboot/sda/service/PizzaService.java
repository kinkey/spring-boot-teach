package com.learning.springboot.sda.service;

import com.learning.springboot.sda.DTO.*;
import com.learning.springboot.sda.entity.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PizzaService {

    List<PizzaDTO> pizzaPersistate = new ArrayList<>();

    public List<PizzaDTO> savePizzas(PizzaOrderRequestDTO pizzaOrder){
        List<PizzaDTO> pizzeDinOrder = new ArrayList<>(); // facem o lista locala ce va contine pizzele pe care vrem sa le returnam

        for (PizzaOrderItemDTO orderItem : pizzaOrder.orderItems){ // iteram prin tipurile de pizza din order. aici pot sa fie diferite pizza types
            for(int i =0; i< orderItem.quantity; i++){ // iteram pentru un numar de x ori, de cate bucati de pizza avem in fiecare pizza type
                PizzaDTO tempPizza = new PizzaDTO(); // facem o pizza temporara pentru a putea sa ne folosim de ea si
                                                    // sa o adaugam in pizzele din order si pizzele pe are vrem sa le avem persistate

                List<IngredientDTO> ingredientDTOS = parseIngredients(orderItem.pizzaName); // metoda asta va da inapoi o lista de ingrediente specifica fiecarui tip de pizza

                tempPizza.setIngrediente(ingredientDTOS); // luam din ingredientele ce au fost create mai devreme si le punem in pizza temporara.
                tempPizza.setName(orderItem.pizzaName); // luam din itemul de pizza pe care il iteram si setam numele
                tempPizza.setBlat(orderItem.blat); // luam din item de pizza pe care il iteram si setam tipul de blat

                pizzeDinOrder.add(tempPizza); // noi aici adaugam pizza temporara in obiectul de pizze doar din order pe
                                            // care vrem sa le returnam userului. la fiecare order diferit, lista asta va putea sa fie diferita
                pizzaPersistate.add(tempPizza); // adaugam aici la lista perisistata de pizze. asta o sa fie o lista de TOATE pizzele pe care le-am facut vreodata primite din ordere.
            }
        }

        return pizzeDinOrder;
    }

    public List<IngredientDTO> parseIngredients(String pizzaName){
        List<IngredientDTO> ingredientDTOS = new ArrayList<>();
        switch (pizzaName){
            case "hot chiz": {
                ingredientDTOS.add(new IngredientDTO("Emmentaler", 1));
                ingredientDTOS.add(new IngredientDTO("Mozzarella", 1));
                ingredientDTOS.add(new IngredientDTO("Parmezan", 1));
                ingredientDTOS.add(new IngredientDTO("Peperoncino", 1));
                return ingredientDTOS;
            }
            case "suprema": {
                ingredientDTOS.add(new IngredientDTO("Mozzarella", 1));
                ingredientDTOS.add(new IngredientDTO("Porumb", 1));
                ingredientDTOS.add(new IngredientDTO("Ceapa", 1));
                ingredientDTOS.add(new IngredientDTO("Carne de vita", 1));
                return ingredientDTOS;
            }
        }
        return ingredientDTOS;
    }

    public List<PizzaDTO> getAllPizzas(){
        return pizzaPersistate;
    }

}
