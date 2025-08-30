package com.company.Algorhitms;

public class MinimunIncreased {

    public static void main(String[] args) {
        int[] inputArray = {1,1,1};

        int count = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if(i < inputArray.length - 1) {
                if(inputArray[i] >= inputArray[i + 1]) {
                    int d = inputArray[i] - inputArray[i + 1] + 1;
                    count = count + d;
                    inputArray[i + 1] = inputArray[i + 1] + d;
                }
            }
        }

    }
}
