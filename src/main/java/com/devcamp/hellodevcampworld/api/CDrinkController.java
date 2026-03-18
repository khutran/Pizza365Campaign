package com.devcamp.hellodevcampworld.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CDrinkController {

    @CrossOrigin
    @GetMapping("/drinks")
    public ArrayList<CDrink> getDrinks() {
        ArrayList<CDrink> drinks = new ArrayList<>();
        
        drinks.add(new CDrink(1, "COCA", "Coca Cola", 15000, 1618723200000L, 1618723200000L));
        drinks.add(new CDrink(2, "PEPSI", "Pepsi", 15000, 1618723200000L, 1618723200000L));
        drinks.add(new CDrink(3, "7UP", "7 Up", 15000, 1618723200000L, 1618723200000L));
        drinks.add(new CDrink(4, "FANTA", "Fanta", 15000, 1618723200000L, 1618723200000L));
        drinks.add(new CDrink(5, "LAVIE", "La Vie", 10000, 1618723200000L, 1618723200000L));
        
        return drinks;
    }
}
