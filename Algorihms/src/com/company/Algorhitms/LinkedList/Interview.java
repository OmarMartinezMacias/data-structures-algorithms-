package com.company.Algorhitms.LinkedList;

import sun.net.www.content.text.Generic;

import java.util.HashMap;

public class Interview {
    String input = "M34A&*D (AM";

    public void main(String[] args){
        cleanUpMethod(input);
    }

    public String cleanUpMethod(String input) {
        String cleanedUpString = "";
        for(int i= 0; i < input.length(); i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                cleanedUpString = cleanedUpString + input.charAt(i);
            }
        }
        return cleanedUpString;
    }

    public void checkForPalindrome(String input) {

        HashMap<Character, Integer> palindromeMap = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            if(palindromeMap.containsKey(input.charAt(i))) {
                palindromeMap.put(input.charAt(i), palindromeMap.get(input.charAt(i)) + 1);
            }else {
                palindromeMap.put(input.charAt(i), 1);
            }
        }

    }

}
