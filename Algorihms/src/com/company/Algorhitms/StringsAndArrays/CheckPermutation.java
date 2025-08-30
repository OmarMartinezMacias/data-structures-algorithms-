package com.company.Algorhitms.StringsAndArrays;

import java.util.HashMap;

public class CheckPermutation {

    public static String checkPermutationString(String string1, String string2){
        HashMap<Character,String> hashjString1 = new HashMap<Character,String>();


        if(string1.length() == string2.length()){

            for(int i = 0; i < string1.length();i++){
                hashjString1.put(string1.charAt(i),null);
            }

            for(int i = 0; i < string2.length(); i++){
                if(hashjString1.containsKey(string2.charAt(i))){
                }else{
                    return "One String is not a permutation of the other";
                }
            }
            return "One String is a permutation of the other";
        }else{
            return "One String is not a permutation of the other";
        }
    }

    public static void main(String[] args) {
        String s1 = "zzzz";
        String s2 = "zzzzzzz";

        int counter = 0;
        int[] letters = new int[128];

        for(int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            if(letters[s2.charAt(i)] > 0){
                counter++;
                letters[s2.charAt(i)]--;
            }
        }

        System.out.println(counter);

    }
}
