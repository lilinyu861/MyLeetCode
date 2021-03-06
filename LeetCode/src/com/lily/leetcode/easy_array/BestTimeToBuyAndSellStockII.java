package com.lily.leetcode.easy_array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 *              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 *
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 *              Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 *              engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStockII {
    // 从左向右遍历，找到目前最小的buy值，从当前buy的位置开始向找到当前最大的sell值，然后计算profit，之后按照这种规则继续查找。
    private static int maxProfit(int[] prices){
        int len1 = prices.length, i=0, buy=0, sell=0, max=0;
        while(i<len1-1){
            while(i<len1-1 && prices[i+1]<=prices[i]) i++;
            buy = prices[i];

            while(i<len1-1 && prices[i+1]>prices[i]) i++;
            sell = prices[i];

            max += sell-buy;
        }
        return max;
    }

    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
