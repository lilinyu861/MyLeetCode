package com.lily.leetcode.easy_array;

import java.util.List;
import java.util.Map;

/**
 * Given a sorted array and a target value,return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array
 */
public class SearchInsertPosition {
    // 遍历法
    private static int searchInsert01(int[] nums, int target) {
        if (target > nums[nums.length-1])
            return nums.length;
        for(int i = 0; i<nums.length; i++){
            if (target <= nums[i])
                return i;
        }
        return -1;
    }

    // 二分查找法
    private static int searchInsert02(int[ ]nums, int target){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = (int) ((left+right)/2);
            if(target <= nums[mid]){
                right= mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] nums = new int[]{5, 5, 5, 5, 5, 6};
        int target = 5;
        int result1 = searchInsert01(nums, target);
        int result2 = searchInsert02(nums, target);
        System.out.println(result1);
        System.out.println(result2);
    }
}

