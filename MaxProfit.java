/*
 * 1 , 2 , 3, 4 ,5
 *     1   2  3  4
 * 
 *    0    1  2  3
 * 
 */

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        //int [] prices = {7,6,4,3,1};
        System.out.println(calProfitFromI(0,prices));
        System.out.println(vallyPeak(prices));
        System.out.println(consucutiveSum(prices));
    }


    public static int calProfitFromI(int intI,int [] prices){

        if (intI >= prices.length) return 0;
        int maxprofit = 0;

        for (int i = intI; i<prices.length; i++){
            int profit = 0;
            for (int j =i+1;j<prices.length;j++){
                if (prices[j]>prices[i]){
                    int profit_test = calProfitFromI(j+1, prices)+prices[j]-prices[i];
                    if(profit_test > profit) profit=profit_test;
                }
            }
            if (profit>maxprofit) maxprofit = profit;
            
        }

        return maxprofit;
    }
    
    public static int vallyPeak(int [] prices){
        int peak = prices[0];
        int vally = prices[0];
        int profit =0 ;
        int i =0;
        while(i<prices.length){
            while(i<prices.length-1 && prices[i]>prices[i+1])i++;
            vally=prices[i];
            while(i<prices.length-1 && prices[i]<prices[i+1])i++;
            peak=prices[i];

            profit += peak-vally;
            i++;
        }
        return profit;
    }

    public static int consucutiveSum(int[] prices){
        int profit=0;
        int i = 0;
        while(i<prices.length-1){
            if (prices[i+1]>prices[i])
            profit += prices[i+1]-prices[i];
            i++;
        }
        return profit;
    }
}
