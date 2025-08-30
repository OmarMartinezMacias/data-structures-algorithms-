package com.company.Algorhitms.StringsAndArrays;

import java.util.HashMap;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        //if (nums.length == 0) return 0;

        int k = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }

        System.out.println(k + 1);
    }
}
