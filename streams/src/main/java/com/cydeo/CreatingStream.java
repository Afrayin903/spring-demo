package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from array
        String [] courses = {"Java", "Selenium", "UFT"};
        Stream <String> courseStream = Arrays.stream(courses);
        System.out.println(courseStream.collect(Collectors.toList()));

        //Creating stream from collection
        List<String> courseList = Arrays.asList("Java", "JavaScript", "C++");
        Stream<String> courseStream2 = courseList.stream();
        System.out.println(courseStream2.collect(Collectors.toList()));

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 101),
                new Course("Selenium", 102),
                new Course("C++", 103),
                new Course("UFT", 104)
        );
        Stream<Course>  stream1 = myCourses.stream();


        //Creating stream from value
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);

    }
}
