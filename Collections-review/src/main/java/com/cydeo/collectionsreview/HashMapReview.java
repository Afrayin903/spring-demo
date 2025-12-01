package com.cydeo.collectionsreview;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class HashMapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ali");
        map.put(2, "Parman");
        map.put(3, "Kamar");
        map.put(4, "Anwar");
        map.put(5, "Jose");
        System.out.println(map.get(2));
        System.out.println("================");
        System.out.println(findFirstNonRepeatingChar("Cydeo Java developer Course"));


    }
    public static Character findFirstNonRepeatingChar(String str){
        Map<Character, Integer> myMap = new HashMap<>();
        //for counting the chars
        int count;
        //counting chars and putting values in the hash map
        for (Character ch : str.toCharArray()){
            if(myMap.containsKey(ch)){
                count = myMap.get(ch);
                myMap.put(ch, count + 1);
            }else {
                myMap.put(ch, 1);
            }
        }
        //starting from string, check if the char count equals 1
        for (Character ch : str.toCharArray()){
            if(myMap.get(ch)==1){
               return ch;
            }
        }
        return Character.MIN_VALUE;
    }

}
