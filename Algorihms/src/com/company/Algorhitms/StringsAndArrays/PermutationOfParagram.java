package com.company.Algorhitms.StringsAndArrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfParagram {

    public static boolean PermutatioChecker(String phrase){
      int countOdd = 0;
      int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

      for(char c: phrase.toCharArray()){
          int x = Character.getNumericValue(c);
          if(x != -1){
              table[x]++;
              if(table[x] % 2 == 1){
                  countOdd++;
              }else{
                  countOdd--;
              }

          }
      }
      return countOdd <= 1;
    }
}
