package com.company.Algorhitms.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4,7,5,3,2,1,9,6,11,52};

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
