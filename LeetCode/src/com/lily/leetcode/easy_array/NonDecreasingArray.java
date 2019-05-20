package com.lily.leetcode.easy_array;

/**
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * Example 1:
 * Input: [4,2,3]
 * Output: True
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * Example 2:
 * Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modify at most one element.
 */
public class NonDecreasingArray {
    private static boolean checkPossibility(int[] nums) {
        // 一次遍历，如果i-1的值大于i，则将其替换，将替换次数累加，若大于1，则返回false。
        // 替换过程要考虑到i-2的值是否小于i，若小于，则将i-1的值替换为i的值，否则，将i的值替换为i-1的值
        int count = 0;
        for (int i = 1; i<nums.length; i++){
            if (nums[i] < nums[i-1]){
                count++;
                if (i-2<0 || nums[i-2]<nums[i]) nums[i-1] = nums[i];
                else nums[i] = nums[i-1];
            }
        }
        if (count>1) return false;
        return true;
    }

    public static void main(String[] args){
        int [] nums = new int[]{ 4, 2, 3};
        boolean result = checkPossibility(nums);
        System.out.println(result);
    }

}
