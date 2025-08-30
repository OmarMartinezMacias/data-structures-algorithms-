package com.company.Algorhitms.StringsAndArrays;

public class PrefixSufix {
    public static void main(String[] args) {
        String S = "abab";
        int n = S.length();
        int[] lps = new int[n]; // Longest Prefix Suffix array

        int len = 0; // longitud del prefijo-sufijo más largo actual
        int i = 1;

        while (i < n) {
            Character iI = S.charAt(i);
            Character iLen = S.charAt(len);
            if (S.charAt(i) == S.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // retrocede
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // El último valor del LPS indica el prefijo más largo que también es sufijo propio
        System.out.println(lps[n - 1]);
    }
}
