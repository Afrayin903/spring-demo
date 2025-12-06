package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> stream1 = Arrays.asList(1,2,3,4,5,2,6,7,8,9,5);
        //stream1.forEach(x -> System.out.println(x));
        stream1.forEach(System.out::print);
        System.out.println();
        //filter
        stream1.stream()
                .filter(i->i%3==0)
                .distinct()
                .forEach(System.out::println);
        System.out.println("====================");

        //Limit
        stream1.stream()
                .filter(i->i%2==0)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("=====================");

        //SKIP
        stream1.stream()
                .filter(i -> i > 2 )
                .distinct()
                .skip(5)
                .forEach(System.out::println);
        System.out.println("=====================");

        //MAP
        stream1.stream()
                .map(num ->num*2)
                .filter(i -> i > 5 )
                .distinct()
                .skip(5)
                .forEach(System.out::println);

    }
}
