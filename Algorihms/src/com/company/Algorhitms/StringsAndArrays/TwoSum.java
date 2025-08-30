package com.company.Algorhitms.StringsAndArrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //i have to return a array indicating the indices of the two number that they add up to the target
    //not sorted
    //hardcode solution two nested for loops o(n^2) but we can do better
    //should i discard ones greater than the target? i could do this if i know for sure there are not negative numbers

    public static void main(String[] args){
        int[] numbers = {3,3};
        int target = 6;
        Map<Integer, Integer> addupMap = new HashMap<>();

        int[] arrayResult = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(addupMap.containsKey(numbers[i])){
                arrayResult[0] = addupMap.get(numbers[i]);
                arrayResult[1] = i;
            }else{
                addupMap.put(target - numbers[i], i);
            }
        }

        System.out.print(arrayResult[0] + " " + arrayResult[1]);
    }
}
