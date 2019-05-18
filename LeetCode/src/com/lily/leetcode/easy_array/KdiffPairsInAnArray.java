package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array of integers and an integer k,
 * you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 *
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1)
 */
public class KdiffPairsInAnArray {
    private static int findPairs(int[] nums, int k) {
        int[] s = new int[nums.length];
        int count = 0;
        if (k==0){
            for (int i = 0; i<nums.length; i++){
                for (int j = i+1 ; j< nums.length; j++){
                    if (nums[i]==nums[j])
                        count++;
                }
            }
        }else {
            for (int i = 0; i < nums.length; i++)
            {
                s[i] = nums[i]+k;
            }
            for (int i = 0; i<nums.length; i++){
                for (int j = i+1 ; j< nums.length; j++){
                    if (s[i]==s[j]) s[i]=Integer.MIN_VALUE;
                }
            }

            for (int j=0; j<nums.length; j++){
                for (int i = 0; i<nums.length; i++){
                    if (s[j]==nums[i]){
                        count++;
                    }
                }
            }
        }


        return count;

    }

    public static void main(String[] args){
        int[] nums = new int[]{3, 1, 4, 1, 5};
        int k = 2;
        int result = findPairs(nums, k);
        System.out.println(result);
    }
}
