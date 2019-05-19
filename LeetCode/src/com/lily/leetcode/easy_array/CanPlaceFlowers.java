package com.lily.leetcode.easy_array;

/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 */
public class CanPlaceFlowers {
    //遍历，找到左边为0，右边为0的值将其赋值为1.然后用count统计个数，和n做比较，当count>=n时符合要求。
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length ; i++) {
            if (flowerbed[i] == 0){
                int next = (i == flowerbed.length-1)? 0:flowerbed[i+1];
                int prev = (i == 0)? 0:flowerbed[i-1];
                if (prev==0 && next ==0)
                {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }


    public static void main(String[] args){
        int[] flowerbed = new int[]{0,0,1,0,0};
        int n = 1;
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}
