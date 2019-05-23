package com.lily.leetcode.medium_array;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class FindFirstAndLastPositionofElementinSortedArray {
    private static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] == target){
                result[0] = i;
                result[1] = i;
                break;
            }
        }
        for (int i = (result[0]+1); i < nums.length; i++){
            if (nums[i] == target){
                result[1] = i;
            }
        }
        return result;
    }

    private static int[] searchRange1(int[] nums, int target){
        int[] result = new int[]{-1, -1};
        result[0] = findStart(nums, target);
        result[1] = findEnd(nums, target);
        return result;
    }

    private static int findStart(int[] nums, int target){
        int left = 0, right = nums.length-1, start = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid] == target){
                start = mid;
                right = mid-1;
            }else if (nums[mid] < target){
                left = mid+1;
            }else if (nums[mid] > target){
                right = mid-1;
            }
        }
        return start;
    }

    private static int findEnd(int[] nums, int target){
        int left = 0, right = nums.length-1, end = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid] == target){
                end = mid;
                left = mid+1;
            }else if (nums[mid] < target){
                left = mid+1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args){
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        int[] result1 = searchRange1(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }
}
