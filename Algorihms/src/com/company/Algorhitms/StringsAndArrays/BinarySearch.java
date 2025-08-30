package com.company.Algorhitms.StringsAndArrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            } else if (nums[mid] < target) {
                left = mid + 1; // buscar a la derecha
            } else {
                right = mid - 1; // buscar a la izquierda
            }
        }
        System.out.println("No encontrado"); // no encontrado
    }

}
