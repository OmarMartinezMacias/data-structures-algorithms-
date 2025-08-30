package com.company.Algorhitms.StringsAndArrays;

public class RotateMatrix {

    public static boolean rotate(int[][] matrix){

        System.out.println(matrix.length);
        int n = matrix.length;

        for(int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            System.out.println(layer + " " + first + " " + last);
            for(int i = first; i < last; i++){
                int offset = i - first;

                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];

                matrix[last-offset][first] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[i][last];

                matrix[i][last] = top;
            }
        }
        return true;
    }
}


