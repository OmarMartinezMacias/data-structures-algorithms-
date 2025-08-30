package com.company.Algorhitms.StringsAndArrays;

public class JumpGame {
    public static void main(String[] args){
        int[] nums = {3,2,1,0,4};

        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                System.out.println(false);
                break;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        System.out.println(true);
    }
}
