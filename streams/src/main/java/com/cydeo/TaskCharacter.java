package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "JavaScript", "C++", "Python");
        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
