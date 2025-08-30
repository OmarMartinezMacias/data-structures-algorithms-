package com.company.Algorhitms.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {4,7,5,3,2,1,9,6,11,52};

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
