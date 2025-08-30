package com.company.Algorhitms.StringsAndArrays;

        import java.util.HashMap;

public class MostRepeteadNumber {

    public static Integer mostRepeteadNum(Integer[] array){
        HashMap<Integer,Integer> mostRe = new HashMap<>();
        Integer aux = null;

        for(int i = 0; i < array.length; i++){

            if(mostRe.containsKey(array[i])){
                mostRe.put(array[i], mostRe.get(array[i]) + 1);
                if(aux != null ) {
                    if (mostRe.get(aux) <= mostRe.get(array[i])) {
                        aux = array[i];
                    }
                } else{
                    aux = array[i];
                }
            }else{
                mostRe.put(array[i],1);
            }
        }
        return aux;
    }
}
