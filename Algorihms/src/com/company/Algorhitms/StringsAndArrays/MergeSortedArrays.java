package com.company.Algorhitms.StringsAndArrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args){
        int[] array1 = {1,2,6,7,10};
        int[] array2 ={2,6,11,30};

        int[] definitiveArray = new int[array1.length + array2.length];

        int firstItemA1 = array1[0];
        int firstItemA2 = array2[0];

        int i = 1;
        int j = 1;
        int r = 0;

        while(i <= array1.length || j <= array2.length) {

            if (firstItemA1 <= firstItemA2 && i <= array1.length || j > array2.length) {
                definitiveArray[r] = firstItemA1;
                if(i < array1.length){
                    firstItemA1 = array1[i];
                }
                i++;
                r++;
            } else {
                definitiveArray[r] = firstItemA2;
                if (j < array2.length) {
                    firstItemA2 = array2[j];
                }
                j++;
                r++;
            }

        }
            for(int element: definitiveArray){
                System.out.println(element);
            }
        }

    }
