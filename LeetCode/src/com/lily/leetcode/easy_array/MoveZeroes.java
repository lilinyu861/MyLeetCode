package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array nums,
 * write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    // 粗暴的解法，两个循环遍历，遇到0，则找到0后面最近的数值进行交换。
    private static void moveZeroes(int[] nums) {
        for (int i = 0; i<nums.length; i++){
                for (int j = i+1; j<nums.length; j++){
                    if (nums[i] == 0){
                        if (nums[j]!=0){
                            nums[i] = nums[j];
                            nums[j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    // 一遍循环解决问题,按顺序将不为0的值替换到前面
    private static void moveZeros2(int[] nums){
        int j = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
//        moveZeroes(nums);
        moveZeros2(nums);
        }
}
