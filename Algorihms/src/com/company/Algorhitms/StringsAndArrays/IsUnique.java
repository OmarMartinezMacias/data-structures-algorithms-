package com.company.Algorhitms.StringsAndArrays;

import java.util.HashMap;
import java.util.Hashtable;

public class IsUnique {

    public static boolean StringUnique(String string){
        HashMap<Character,Integer> uniqueMap = new HashMap<Character,Integer>();

        for(int i = 0; i < string.length(); i++){
            if(uniqueMap.containsKey(string.charAt(i))){
                return false;
            }else{
                uniqueMap.put(string.charAt(i),null);
            }
        }
        return true;
    }
}
