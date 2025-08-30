package com.company.Algorhitms.StringsAndArrays;

public class BestTimeToSell {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        //int[] prices = {7,2,4,3,1,7,1};

        int actual = prices[0];
        int maxPrice = 0;
        for(int i = 0; i < prices.length; i++){
            if((i + 1) == prices.length) break;
            if(actual < prices[i + 1]) {
                int aux = (prices[i + 1] - actual);
                if( aux > maxPrice) {
                    maxPrice = aux;
                }
            } else {
                actual = prices[i + 1];
            }
        }
        System.out.println(maxPrice);
    }
}
