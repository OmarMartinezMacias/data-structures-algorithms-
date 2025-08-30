package com.company.Algorhitms.StringsAndArrays;

public class URLify {

    public static StringBuilder StringReplacer(String string){
        String susti = "%20";
        char empty = 32;
        StringBuilder newString = new StringBuilder(string);
        int aux = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == empty){
                if(string.charAt(i + 1) == empty){
                    return newString;
                }
                newString.replace(i + aux,i + 1 + aux,susti);
                aux = aux + 2;
            }
        }
        return newString;
    }
}
