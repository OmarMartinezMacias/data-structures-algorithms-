package com.company.Algorhitms.StringsAndArrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {1,15,50,7,500,4,3,79,44,27};
        System.out.print(repeteadNumbers(nums));


    }

    public static boolean repeteadNumbers(int[] nums){
        HashSet repeteadSet = new HashSet();

        for(int element: nums){
            if(repeteadSet.contains(element)){
                return true;
            }else{
                repeteadSet.add(element);
            }
        }
        return false;
    }
}
