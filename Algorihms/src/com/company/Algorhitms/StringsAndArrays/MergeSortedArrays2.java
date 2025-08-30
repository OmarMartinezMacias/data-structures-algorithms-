package com.company.Algorhitms.StringsAndArrays;

public class MergeSortedArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, 0, 0, 0};
        int[] nums2 = {1, 3, 6};

        int m = 3;
        int n = 3;
        int p1 = m - 1;       // puntero en nums1
        int p2 = n - 1;       // puntero en nums2
        int p = m + n - 1;    // puntero final en nums1

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Si quedan elementos en nums2, los copiamos
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
