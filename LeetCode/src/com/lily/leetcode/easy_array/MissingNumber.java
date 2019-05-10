package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */
public class MissingNumber {
    // 先将数组排序，排序后从0到nums.length比较，查找缺少数字，若不缺少则返回nums.length这个数字
    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=i)
                return i;
        }
        return nums.length;
    }

    //计算数组不缺数字时应该的和值，然后减去数组的和值，差便是缺少的数据
    private static int missingNumber2(int[] nums){
        int len = nums.length;
        int sum = (len)*(len+1)/2;//等差数列求和公式Sn=n(a1+an)/2
        for (int i=0; i<len; i++){
            sum -= nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
//        int result = missingNumber(nums);
        int result = missingNumber2(nums);
        System.out.println(result);
    }
}
