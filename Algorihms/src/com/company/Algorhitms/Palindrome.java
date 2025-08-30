package com.company.Algorhitms;

import java.util.HashMap;

public class Palindrome {
    public static void main(String[] args) {
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < inputString.length(); i++) {
            if(map.containsKey(inputString.charAt(i))) {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            } else {
                map.put(inputString.charAt(i), 1);
            }
        }

        if(map.containsValue(1)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
