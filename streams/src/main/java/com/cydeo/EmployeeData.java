package com.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "John", "john123@gmail.com", Arrays.asList("1234567873", "2133334675")),
                new Employee(100, "mike", "mike123@gmail.com", Arrays.asList("1234567373", "2133234675")),
                new Employee(100, "justin", "justin123@gmail.com", Arrays.asList("1235467873", "2123334675"))


        );
    }
}
