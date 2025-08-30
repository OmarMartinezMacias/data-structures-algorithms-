package com.company.Algorhitms.StringsAndArrays;

public class MaximunSubarray {

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxCount = 0;
        int currentCount = 0;

        for(int i = 0; i < nums.length; i++){
            currentCount = currentCount + nums[i];
            if(maxCount < currentCount){
                maxCount = currentCount;
            }
            if(currentCount<0){
                currentCount = 0;
            }
        }
        System.out.print(maxCount);
    }
}
