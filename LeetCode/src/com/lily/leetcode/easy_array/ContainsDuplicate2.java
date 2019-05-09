package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicate2 {
    //先排序，然后找到重复的元素，若存在，则返回true，若不存在，则返回false, 这种做法耗时较长。
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    //
    private static boolean containsDuplicate2(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        int[] nums = new int[]{1,3};
        boolean result = containsDuplicate(nums);
        boolean result2 = containsDuplicate2(nums);
        System.out.println(result);
        System.out.println(result2);
    }
}
