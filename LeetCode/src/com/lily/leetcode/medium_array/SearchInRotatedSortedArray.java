package com.lily.leetcode.medium_array;

import java.util.Arrays;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SearchInRotatedSortedArray {
    private static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    private static int search1(int[] nums, int target) {
//  二分法
        if (nums.length < 1) return -1;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else left = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else right = mid - 1;
            }

        }
        return target == nums[left] ? left : -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums, target);
        int result1 = search1(nums, target);
        System.out.println(result);
        System.out.println(result1);
    }
}
