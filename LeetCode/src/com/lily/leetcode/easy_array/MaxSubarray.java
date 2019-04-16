package com.lily.leetcode.easy_array;

/**
 *Given an integer array nums,
 * find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubarray {
    // 暴力
    private static int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            int total = 0;
            for(int j = i; j < nums.length; j++)
            {
                total = total + nums[j];
                if (total > max)
                    max = total;
            }
        }
        return max;
    }

    /*
     动态规划方法
     首先比较将元素加入的两种情况（只有该元素，或有该元素的相邻元素）
     其次比较加入元素与不加入元素值的区别
      */
    private  static int maxSubArray1(int[] nums) {
        int maxSoFar = nums[0], maxAdd = nums[0];
        for (int i = 1; i<nums.length; i++){
            maxAdd = Math.max(maxAdd+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxAdd);
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        int [] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        int result1 = maxSubArray1(nums);
        System.out.println(result);
        System.out.println(result1);
    }
}
