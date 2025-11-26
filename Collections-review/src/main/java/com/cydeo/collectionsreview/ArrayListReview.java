package com.cydeo.collectionsreview;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An"));
        students.add(new Student(2, "Af"));
        students.add(new Student(3, "Sa"));
        students.add(new Student(4, "Ka"));
        //System.out.println(students);
        printDouble(students);

    }

    private static void printDouble (List<Student> students){
        for (Student student: students) {
            System.out.println(student.id + " " + student.name);
        }
        //or
        System.out.println("========================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        //or
        System.out.println("========================");
        //Both method useful, but Iterator needs cast when get item backwards
        //Iterator<?> iter = students.listIterator();
        ListIterator<?> iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Backwards iterator
        System.out.println("========================");
        while (iter.hasPrevious()){
            System.out.println(iter.previous());
        }
        System.out.println("========================");
        //Lambda
        //students.forEach(student -> System.out.println(student));
        students.forEach(System.out::println);

        //Sorting Elements in list
        System.out.println("=====================================");
        //Collections.sort(students, new sortByIdDesc());
        students.sort(new sortByIdDesc());
        System.out.println(students);

        System.out.println("=====================================");
        //Collections.sort(students, new sortByNameDesc());
        students.sort(new sortByNameDesc());
        System.out.println(students);

    }
    static class sortByIdDesc implements Comparator <Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }
    static class sortByNameDesc implements Comparator <Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
