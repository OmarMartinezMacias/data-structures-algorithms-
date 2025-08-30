package com.company.Algorhitms;

public class EncryptedAlgorithm {

    public static void main(String args[]) {
        String s = "www.abc.xy";
        int k = 87;
        String decriptedString = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-') {
                decriptedString = decriptedString + "-";
            } else {
                int asciiCodeOriginal = (int) s.charAt(i);
                if((asciiCodeOriginal >= 65 && asciiCodeOriginal <= 90) || (asciiCodeOriginal >= 97 && asciiCodeOriginal <= 122)) {
                    int asciiCode = asciiCodeOriginal + k;
                    if(asciiCode > 122){
                        asciiCode = 96 + (asciiCode - 122);
                    } else if(asciiCode > 90 && (asciiCodeOriginal >= 65 && asciiCodeOriginal <= 90)) {
                        asciiCode = 64 + (asciiCode - 90);
                    }
                    String chDecripted = Character.toString((char)asciiCode);
                    decriptedString = decriptedString + chDecripted;
                } else {
                    decriptedString = decriptedString + s.charAt(i);
                }

            }
        }

        System.out.print(decriptedString);
    }
}

