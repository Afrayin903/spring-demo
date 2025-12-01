package com.cydeo.collectionsreview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
       int [] myArray = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(myArray, 9)));
    }

    public static int [] twoSum(int[] array, int target){
        //n(n)
//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i] + array[j] == target) return new int[]{i, j};
//
//            }
//        }
        //Optimal solution  O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array [i];
            if(map.containsKey(potentialMatch)){
               return new int[]{map.get(potentialMatch), i};
            }
            map.put(array[i], i);
        }

        return new int[]{};
    }
}
