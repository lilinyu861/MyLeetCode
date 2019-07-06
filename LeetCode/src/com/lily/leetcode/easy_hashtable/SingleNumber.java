package com.lily.leetcode.easy_hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int num : nums){
            Integer count = res.get(num);
            count = count == null ? 1:++count;
            res.put(num, count);
        }
        for (int key : res.keySet()){
            Integer count = res.get(key);
            if (count == 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        int result = new SingleNumber().singleNumber(nums);
        System.out.println(result);
    }
}
