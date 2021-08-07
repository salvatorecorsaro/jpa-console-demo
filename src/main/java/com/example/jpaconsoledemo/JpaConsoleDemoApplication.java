package com.example.jpaconsoledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaConsoleDemoApplication implements CommandLineRunner {

//        version with the repository being passed

//    private final CoffeeRepository coffeeRepository;
//
//    public JpaConsoleDemoApplication(CoffeeRepository coffeeRepository) {
//        this.coffeeRepository = coffeeRepository;
//    }

    @Autowired
    MainMenuAutowired mainMenuAutowired;

    public static void main(String[] args) {
        SpringApplication.run(JpaConsoleDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
//        version with the repository being passed

//        var mainMenu = new MainMenu(coffeeRepository);
//        mainMenu.printAllCoffees();

//        version with the use of spring components, the better one!
        mainMenuAutowired.printAllCoffees();
    }
}


