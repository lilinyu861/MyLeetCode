package com.lily.leetcode.medium_list;

import com.sun.org.apache.xerces.internal.xs.ShortList;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums,
 * return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < (1<<nums.length); i++){
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++){
                if (((i >>j) & 1 )== 1) tmp.add(nums[j]);
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = new Subsets().subsets(nums);
        System.out.println(result.toString());
    }
}
