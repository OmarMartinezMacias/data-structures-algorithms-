package com.company.Algorhitms.StringsAndArrays;

import java.util.ArrayList;
import java.util.List;

public class HeaviestPackage {

    public static void main(String[] args){

        List<Integer> packageWeights = new ArrayList<>();
        packageWeights.add(2);
        packageWeights.add(9);
        packageWeights.add(10);
        packageWeights.add(3);
        packageWeights.add(7);

        int i = 1;
        Integer greatesPackage = 0;
        Integer sum = 0;
        while(i < packageWeights.size()){
            if(packageWeights.get(i) < packageWeights.get(i + 1)){
                sum = packageWeights.get(i) + packageWeights.get(i + 1);
                packageWeights.remove(packageWeights.get(i));
                packageWeights.remove(packageWeights.get(i+1));
                packageWeights.add(i, sum);

            }else if(packageWeights.get(i) > packageWeights.get(i - 1)){
                sum = packageWeights.get(i) + packageWeights.get(i - 1);
                packageWeights.remove(packageWeights.get(i));
                packageWeights.remove(packageWeights.get(i-1));
                packageWeights.add(i, sum);
            }else{
                i++;
            }


            greatesPackage = greatesPackage > sum ? greatesPackage : sum;

        }

        System.out.print(greatesPackage);
    }
}
