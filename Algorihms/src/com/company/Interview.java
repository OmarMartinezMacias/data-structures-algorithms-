package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Interview {

    //["a","a","b","b","c","c","c"]
    //[""a""]
    //[""a"",""b"",""b"",""b"",""b"",""b"",""b"",""b"",""b"",""b"",""b"",""b"",""b""]

    public static void main(String[] args) {

        List<String> first = new ArrayList<>();
        first.add("a");
        first.add("a");
        first.add("b");
        first.add("b");
        first.add("c");
        first.add("c");
        first.add("c");

        List<String> sec = new ArrayList<>();
        sec.add("a");

        List<String> third = new ArrayList<>();
        third.add("a");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");
        third.add("b");

        System.out.print(listCreator(first, groupCharacters(first)));
        System.out.print(listCreator(sec, groupCharacters(sec)));
        System.out.print(listCreator(third, groupCharacters(third)));

    }

    private static List<String> listCreator (List<String> list, HashMap<String, Integer> groupCharacters) {
        List<String> finalList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            Integer counts = groupCharacters.get(list.get(i));
            if(counts == 1) {
                finalList.add(list.get(i));
            } else if(counts >= 10) {
                finalList.add(list.get(0));
                String stringCount = counts.toString();
                for(int j = 0; j < stringCount.length(); j++){
                    finalList.add(Character.toString(stringCount.charAt(j)));
                }
            } else {
                finalList.add(list.get(i));
                finalList.add(counts.toString());
            }
        }

        return finalList;
    }

    private static HashMap<String, Integer> groupCharacters(List<String> list) {

        HashMap<String, Integer> countMap = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            if(countMap.containsKey(list.get(i))) {
                countMap.put(list.get(i), countMap.get(i) + 1);
            } else {
                countMap.put(list.get(i), 0);
            }
        }

        return countMap;
    }
}
