package com.company.Algorhitms.StringsAndArrays;

public class OneWay {

    public static boolean OneWayChecker(String word1, String word2) {

        if (word1.length() == word2.length()) {
            return OneWayReplacer(word1, word2);
        } else if (word1.length() > word2.length()) {
            return OneWayInsert(word2, word1);
        } else {
            return OneWayInsert(word1, word2);
        }
    }


    private static boolean OneWayReplacer(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }
        return count <= 1;
    }

    private static boolean OneWayInsert(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < word1.length() && index2 < word2.length()){
            if (word1.charAt(index1) != word2.charAt(index2)){
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;

            }
        }
        return true;
    }

    

}
