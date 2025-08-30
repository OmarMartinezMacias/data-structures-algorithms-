package com.company.Algorhitms.StringsAndArrays;

public class ReverseString {
    public static void main(String[] args){
        String stringToBeReversed = "Hello there";

        StringBuilder reversedString = new StringBuilder(stringToBeReversed.length());
        int j = stringToBeReversed.length();

        for(int i = stringToBeReversed.length() - 1 ; i >= 0 ; i--){
          reversedString.append(stringToBeReversed.charAt(i));
        }

        System.out.println(reversedString.toString());
    }

}
