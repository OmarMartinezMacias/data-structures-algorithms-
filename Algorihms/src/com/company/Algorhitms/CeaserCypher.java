package com.company.Algorhitms;

public class CeaserCypher {
    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;
        String decriptedString = "";
        for(int i = 0; i < s.length(); i++) {
            int asciiCodeOriginal = (int) s.charAt(i);
            if((asciiCodeOriginal < 65 || (asciiCodeOriginal > 90 && asciiCodeOriginal < 97) || asciiCodeOriginal > 122)) {
                decriptedString = decriptedString + s.charAt(i);
            } else {
                float asciiCodeDecripted = 14/25;
                if((asciiCodeOriginal >= 65 && asciiCodeOriginal <= 90)) {
                    asciiCodeDecripted = ((asciiCodeOriginal + k) - 65 % 25) * 25;
                } else {
                    asciiCodeDecripted = 10 % 2; //- 97) % 25) * 25;
                    System.out.println(asciiCodeDecripted);
                }

                if(asciiCodeOriginal >= 97) {
                    asciiCodeDecripted = asciiCodeDecripted + 97;
                }else {
                    asciiCodeDecripted = asciiCodeDecripted + 65;
                }
                String chDecripted = Character.toString((char)asciiCodeDecripted);
                decriptedString = decriptedString + chDecripted;

            }
        }

        System.out.print(decriptedString);
    }
}
