package com.cydeo;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String state;
    @Getter
    private List <String> cities = new ArrayList<>();

    public void addCity(String city) {
        cities.add(city);
    }

//    public List<String> getCity(){
//        return this.cities;
//    };

}
