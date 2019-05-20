package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array consisting of n integers,
 * find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 */
public class MaximumAverageSubarrayI {
    // 先使用数组sum存储前i项相加的和，然后比较连续的k个值之间最大的和，之后再求平均值。
    private static double findMaxAverage(int[] nums, int k) {
        double max_avg=0;
        int[] sum = new int[nums.length+1];
        for (int i = 1; i < nums.length+1; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }

        int ans = Integer.MIN_VALUE;
        for (int i = k ; i < nums.length+1; i++){
            ans = Math.max(ans, sum[i]-sum[i-k]);
        }
        max_avg = ans*1.0/k;
        return max_avg;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println(result);
    }
}
