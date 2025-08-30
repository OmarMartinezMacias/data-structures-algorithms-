package com.company.Algorhitms.StringsAndArrays;

public class RemoveDuplicateSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        //if (nums.length <= 2) return nums.length;

        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(k);
    }
}
