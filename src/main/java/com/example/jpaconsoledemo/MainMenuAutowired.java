package com.example.jpaconsoledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainMenuAutowired {

    final
    CoffeeRepository coffeeRepository;

    @Autowired
    public MainMenuAutowired(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }


    public void printAllCoffees() {
        var coffee = new Coffee(1L, "Black Coffee");
        coffeeRepository.save(coffee);
        var allCoffees = coffeeRepository.findAll();
        for (var c : allCoffees) System.out.println("Our menu includes: " + c.getName());
    }
}
