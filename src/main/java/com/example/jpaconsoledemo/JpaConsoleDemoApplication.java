package com.example.jpaconsoledemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JpaConsoleDemoApplication implements CommandLineRunner {


    private final CoffeeRepository coffeeRepository;

    public JpaConsoleDemoApplication(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(JpaConsoleDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var mainMenu = new MainMenu(coffeeRepository);
        mainMenu.printAllCoffees();
    }
}


