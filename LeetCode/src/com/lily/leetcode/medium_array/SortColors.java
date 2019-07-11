package com.lily.leetcode.medium_array;

import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors {
    /*
    // 冒泡排序
    public void sortColors(int[] nums) {
        for (int i = nums.length-1; i >=0; i--){
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    */

    public void sortColors(int[] nums) {
        // 桶排序， 先统计每个颜色的个数，然后再修改数组数据。
        int [] res = new int [3];
        for (int i = 0; i < nums.length; i++){
            int index = nums[i]%3;
            res[index] += 1;
        }

        int i = 0;
        int j = 0;
        while(i < 3){
            int count = res[i];
            while(count > 0){
                nums[j++] = i;
                count--;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        new SortColors().sortColors(nums);
    }
}
