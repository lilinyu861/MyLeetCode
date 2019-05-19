package com.lily.leetcode.easy_array;

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 */
public class ShortestUnsortedContinuousSubarray {
    private static int findUnsortedSubarray(int[] nums) {
        int n = nums.length, beg = -1, end = -2, min = nums[0], max = nums[n-1];
        for (int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n-1-i]);
            if (max > nums[i]) end = i;
            if (nums[n-1-i] > min) beg = n-1-i;
        }
        return end-beg+1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        int result = findUnsortedSubarray(nums);
        System.out.println(result);
    }
}
