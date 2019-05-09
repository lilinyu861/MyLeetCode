package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
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
