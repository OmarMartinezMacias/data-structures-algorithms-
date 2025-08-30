package com.company;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;

public class Interview2 {

    public static void main(String[] args) {

        String letter = "banana";

        HashMap<Character, Integer> counterLetter = new HashMap<>();

        for(int i = 0; i < letter.length(); i++) {
            if(counterLetter.containsKey(letter.charAt(i))) {
                counterLetter.put(letter.charAt(i), counterLetter.get(letter.charAt(i)) + 1);
            } else {
                counterLetter.put(letter.charAt(i), 1);
            }
        }

        for(int i = 0; i < letter.length(); i++){
            Character charac = letter.charAt(i);
            if(counterLetter.containsKey(charac)) {
                System.out.println(charac + " = " + counterLetter.get(charac));
                counterLetter.remove(charac);
            }
        }
    }
}
