package com.lily.leetcode.easy_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    //使用hashmap解决问题
    private static boolean containsDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            //hash.map的返回值：若key不重复，则返回null，若key重复，则返回当前key对应的value值。
            Integer ord = map.put(nums[i], i);
            if (ord != null && i-ord<=k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        boolean result = containsDuplicate2(nums, k);
        System.out.println(result);
    }
}
