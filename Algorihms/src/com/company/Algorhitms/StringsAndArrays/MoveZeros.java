package com.company.Algorhitms.StringsAndArrays;

public class MoveZeros {

    public static void main(String[] args){
        int[] num = {0,1,0,3,12};

        for(int i = 0; i < num.length; i++){
            if(num[i] == 0){
                for(int j = i + 1; j < num.length; j++){
                    if(num[j] != 0){
                        int aux = num[j];
                        num[j] = 0;
                        num[i] = aux;
                        break;
                    }
                }
            }
        }

        for(int element: num){
            System.out.print(element + " ");
        }

    }
}
