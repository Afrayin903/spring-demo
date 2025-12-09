package com.cydeo;

import task.Dish;
import task.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        //All match
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);
        //Any match
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }
        //None match
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //Find any
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //Find first
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish.get());

    }
}
