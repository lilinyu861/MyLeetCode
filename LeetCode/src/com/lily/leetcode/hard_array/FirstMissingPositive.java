package com.lily.leetcode.hard_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an unsorted integer array, find the smallest missing positive integer.

 Example 1:

 Input: [1,2,0]
 Output: 3
 Example 2:

 Input: [3,4,-1,1]
 Output: 2
 Example 3:

 Input: [7,8,9,11,12]
 Output: 1
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
       int i = 0;
       while(i < nums.length){
           if (nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
           else if (nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
           else i++;
       }
       i = 0;
       while (i < nums.length && nums[i] == i+1) i++;
       return i+1;
    }

    private static void swap(int []nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,-7,8,9,11,12};
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
