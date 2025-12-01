package com.cydeo.collectionsreview;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(4, "John"));
        set.add(new Student(6, "Joe"));
        set.add(new Student(7, "Jessy"));
        set.add(new Student(5, "July"));
        set.add(new Student(5, "July"));
        System.out.println(set);
        System.out.println("First repeating: " + firstRepeatingChar("Java developer"));


    }
    public static Character firstRepeatingChar(String str){
        //Create hashmap
        Set<Character> chars = new HashSet<>();
        //Iteration return ch if add returns false
        for (Character ch : str.toCharArray()){
            if(!chars.add(ch)) return ch;

        }
        return null;
    }
}
