package com.company.Algorhitms.StringsAndArrays;

public class MajorityNumber {

    public static void main(String[] args) {
        int[] nums = {10,9,9,9,10};

        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        System.out.println(candidate);
    }
}
