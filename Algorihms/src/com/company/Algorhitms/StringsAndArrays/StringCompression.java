package com.company.Algorhitms.StringsAndArrays;

public class StringCompression {

    public static StringBuilder StringCompresor (String string){

        StringBuilder stringCompres = new StringBuilder();
        char charac = 32;
        Integer count = 0;

        for(int i =  0; i < string.length(); i++){
            if(charac != string.charAt(i)) {
                if (charac != 32) {
                    stringCompres.append(charac + "" + count.toString());
                    count = 0;
                }
                charac = string.charAt(i);
            }
            count++;
        }
        stringCompres.append(charac + "" + count.toString());
        return stringCompres;
    }
}
