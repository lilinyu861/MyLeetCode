package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    //暴力,再建立一个数组然后对新建数组进行填充，输出。
        private static void rotate(int[] nums, int k) {
            int[] s = new int[nums.length];
            for (int i=0; i<k; i++){
                s[i] = nums[nums.length-k+i];
            }
//            System.out.println(Arrays.toString(s));
            for (int i = k; i<nums.length; i++)
            {
                s[i] = nums[i-k];
            }
            System.out.println(Arrays.toString(s));
        }

        //暴力，再建立一个数组用于存储[0,nums.length-k]个数据，
        // 然后将nums数组的[nums.length-k,num.length-1]调整到前面之后进行拼接。
        private static void rotate1(int[] nums, int k) {
           int[] s = new int[nums.length-k];
           for (int i = 0; i<nums.length-k; i++)
           {
               s[i] = nums[i];
           }
           for (int i = 0; i<k; i++){
               nums[i] = nums[nums.length-k+i];
           }
           for (int i = 0; i<nums.length-k; i++){
               nums[k+i] = s[i];
           }
           System.out.println(Arrays.toString(nums));
        }

        //先将nums数组进行翻转，然后将[0,k-1]和[k,nums.length-1]进行翻转
        public static void rotate2(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
            System.out.println(Arrays.toString(nums));
        }

        public static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args){
            int[] nums = new int[]{1,2,3,4,5,6,7};
            int k = 3;
//            rotate(nums, k);
//            rotate1(nums, k);
            rotate2(nums, k);
        }
}
