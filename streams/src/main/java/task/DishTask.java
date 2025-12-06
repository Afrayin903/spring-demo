package task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {
        //print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);
        //print the length of the name of each dish
        System.out.println("==========================");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //print three high caloric dish name (>300)
        System.out.println("==========================");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //print all dish name that are below 400 calories in sorted and dsc
        System.out.println("==========================");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}
