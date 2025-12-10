package com.cydeo;

import task.Dish;
import task.DishData;
import task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 60);
        //toCollection(Supplier): is used to create a collection using collector
        List<Integer> list = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

        Set<Integer> list2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(list2);

        //toList(): returns a collector interface that gathers the input data into a new list
        List<Integer> list3 = numbers.stream()
                .filter(x -> x%2==0)
                .toList();
        System.out.println(list3);

        //toSet(): returns a collector interface that gathers the input data into a new set
        Set<Integer> list4 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());
        System.out.println(list4);

        //toMap()(Function, Function): returns a collector interface that gathers the input data into a new map
         Map <String, Integer> dishList= DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishList);

        //counting(): returns a collector that counts the number of the elements
        Long count = DishData.getAll().stream()
                .map(Dish::getName)
                .collect(Collectors.counting());
        System.out.println(count);

        //summingInt(ToIntFunction): returns a Collector that produces the sum of a integer-value func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);

        //joining(): is used to join various elements of character or string array into a single string object
        List<String> courseList = Arrays.asList("Java", "JavaScript", "C++");
       String course =  courseList.stream()
                .collect(Collectors.joining(","));
        System.out.println(course);

        //portioningBy(): is used to partition a stream of objects(or set of elements) based on a given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy(): is used for grouping objects by some property and storing results in a map instance
        Map<Type, List<Dish>> dishesType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishesType);
    }
}
