package com.cydeo;

import task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(31, 21, 87, 44);
        int result = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        //No initial value
        Optional<Integer> result2 = list.stream().reduce((a, b)->a+b);
        System.out.println(result2);

        //Max and Min
        Optional<Integer> result3 = list.stream().reduce(Integer::min);
        Optional<Integer> result4 = list.stream().reduce(Integer::max);
        Optional<Integer> result5 = list.stream().reduce(Integer::sum);
        System.out.println("Min value: " + result3 + "\nMax value: " + result4 + "\nSum value: " + result5);

        //Task
        int dishCount = DishData.getAll().stream().map(d ->1).reduce(0, ((a, b)->a+b));
        System.out.println(dishCount);

        long dishCount2 = DishData.getAll().stream().count();
        System.out.println(dishCount2);
    }
}
