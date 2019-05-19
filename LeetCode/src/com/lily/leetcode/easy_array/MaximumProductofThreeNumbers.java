package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an integer array,
 * find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: 6
 *
 *
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: 24
 */
public class MaximumProductofThreeNumbers {
    // 最大的乘机有两种情况，一种是三个正整数相乘成绩最大，一种是一个最大的正整数乘最小的两个负数。
    private static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first = nums[nums.length-1], second = nums[nums.length-2], third = nums[nums.length-3], min1 = nums[0], min2=nums[1],sum=0;
        sum = Math.max(first*second*third, first*min1*min2);
        return sum;
    }

    private static int maximumProduct1(int[] nums){
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i]>max2){
                max3 = max2;
                max2 = nums[i];
            }
            else if (nums[i]>max3){
                max3 = nums[i];
            }

            if (nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }
            else if (nums[i]<min2){
                min2 = nums[i];
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        int result = maximumProduct(nums);
        System.out.println(result);
    }
}
