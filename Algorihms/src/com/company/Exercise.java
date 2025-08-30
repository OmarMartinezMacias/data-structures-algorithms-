package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static void main(String args[]) {
        int num = 26; //numer to change
        int sum = 0;
        int j = 1;

        List<Integer> binaryNum = new ArrayList<>();

        List<Integer> sequence = new ArrayList<>();


        while (j < num) {
            sequence.add(0, j);
            j = j * 2;

        }

        for (int i = 0; i < sequence.size(); i++) {
            if (sum + sequence.get(i) <= num) {
                binaryNum.add(1);
                sum = sum + sequence.get(i);
            } else {
                binaryNum.add(0);
            }
        }

        for(Integer i: binaryNum){
            System.out.println(i);

        }
    }
}
