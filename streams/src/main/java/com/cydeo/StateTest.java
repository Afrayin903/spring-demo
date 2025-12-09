package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        State va = new State();
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("Chantilly");
        va.addCity("FallsChurch");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Houston");
        tx.addCity("Austin");

        List <State> list = Arrays.asList(va, tx);
//        list.stream()
//                .map(State::getCity)
//                .forEach(System.out::println);
        list.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
