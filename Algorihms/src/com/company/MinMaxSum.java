package com.company;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);


        int omitted = 0;
        long maxSum = 0;
        long minSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            long temp = 0;
            for(int j = 0; j < arr.size(); j++) {
                if(omitted != j){
                    temp = temp + arr.get(j);
                }
            }

            if(temp > maxSum ){
                maxSum = temp;
            }

            if(temp < minSum || minSum == 0){
                minSum = temp;
            }

            omitted++;

        }
        System.out.println(minSum + " " + maxSum);
    }
}
