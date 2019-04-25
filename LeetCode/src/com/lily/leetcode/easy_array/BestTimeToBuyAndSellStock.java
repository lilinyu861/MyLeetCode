package com.lily.leetcode.easy_array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {
    // 暴力求解，需要计算所有符合左边的数据小于右边的数据的差值，然后进行比较。
    private static int maxProfit(int[] prices) {
        int max = 0;
        int len1 = prices.length;
        for(int i = 0; i < len1; i++){
            for (int j = i; j<len1; j++){
                if(prices[i]<prices[j]){
                    max = Math.max(max, (prices[j]-prices[i]));
                }
            }
        }
        return max;
    }

    //暴力求解，比较后计算差值。
    private static int maxProfit1(int[] prices){
        int max = 0;
        int len1 = prices.length;
        for(int i = 0; i < len1-1; i++){
            int temp = 0;
            for (int j = i+1; j<len1; j++){
                temp = temp>prices[j]?temp:prices[j];
            }
            if (temp > prices[i])
                max = Math.max(max, temp-prices[i]);
//            System.out.println(i+"_"+temp+"-"+prices[i]+" "+ "max");
        }
        return max;
    }

    //使用Kadane算法计算
    private static int maxProfit2(int[] prices){
        int max1 = 0, max2 = 0;
        for (int i = 1; i < prices.length; i++){
            max1 = Math.max(0, max1 += prices[i]-prices[i-1]);
            max2 = Math.max(max1, max2);
        }
        return max2;
    }



    public static void main(String[] args){
        int [] prices = new int[]{3,2,6,5,0,3};
        int result = maxProfit(prices);
        int result1 = maxProfit1(prices);
        int result2 = maxProfit2(prices);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
