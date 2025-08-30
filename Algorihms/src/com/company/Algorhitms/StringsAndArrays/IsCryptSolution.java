package com.company.Algorhitms.StringsAndArrays;

import java.util.HashMap;

public class IsCryptSolution {

    public static boolean isCryptSolutionV1(String[] crypt, char[][] solution) {
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        StringBuffer left = new StringBuffer();
        StringBuffer middle = new StringBuffer();
        StringBuffer right = new StringBuffer();
        int n = solution.length;
        if(n != 0){


            for(int i = 0; i < n; i++){
                map.put(solution[i][0],solution[i][1]);
            }

            for(int i = 0; i < crypt.length; i++){
                for(int j = 0; j < crypt[i].length(); j++){
                    if(map.get(crypt[i].charAt(0)) == '0'){
                        if(crypt[i].length() != 1){
                            return false;
                        }
                    }
                    if(i == 0){
                        left.append(map.get(crypt[i].charAt(j)));
                    }else if(i == 1){
                        middle.append(map.get(crypt[i].charAt(j)));
                    }else{
                        right.append(map.get(crypt[i].charAt(j)));
                    }
                }
            }

            return Integer.toString(Integer.parseInt(String.valueOf(left)) + Integer.parseInt(String.valueOf(middle))).equals(right.toString());
        }else{
            return false;
        }
    }

    public static boolean isCryptSolutionV2(String[] crypt, char[][] solution) {
        StringBuffer[] crypts = {new StringBuffer(crypt[0]), new StringBuffer(crypt[1]), new StringBuffer(crypt[2])};

        int n = solution.length;
        int index = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < crypts.length;j++){
                index = crypts[j].indexOf(Character.toString(solution[i][0]));
                while(index != -1){
                    crypts[j].replace(index, index + 1, Character.toString(solution[i][1]));
                    index = crypts[j].indexOf(Character.toString(solution[i][0]));
                }
            }
        }

        System.out.println(crypts[0] + " " + crypts[1] + " " + crypts[2]);

        System.out.println(Double.parseDouble(String.valueOf(crypts[0])) + Double.parseDouble(String.valueOf(crypts[1])) + " " + Double.parseDouble(String.valueOf(crypts[2])));
        return Double.parseDouble(String.valueOf(crypts[0])) + Double.parseDouble(String.valueOf(crypts[1])) == Double.parseDouble(String.valueOf(crypts[2]));
    }
}
