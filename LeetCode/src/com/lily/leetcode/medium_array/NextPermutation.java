package com.lily.leetcode.medium_array;

import java.util.Arrays;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place and use only constant extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
public class NextPermutation {
    // 下一个完全序列
    private static void nextPermutation(int[] nums) {
        if(nums.length<=1){
            return;
        }
        // 从右向左找到非逆序的数值的索引index
        int index = -1;
        for (int i = nums.length-1; i > 0; i--){
            if (nums[i-1] < nums[i]) {
                index = i-1;
                break;
            }
        }
        // 将index后面的数据按照升序排序
        for (int i = nums.length-1; i > (nums.length+index)/2 ; i--){
            int temp = nums[i];
            nums[i] = nums[nums.length-i+index];
            nums[nums.length-i+index] = temp;
        }
        // 将index与右边的数据中最接近又大于index的值与index值交换。
        if (index>=0){
            for (int i = index+1; i < nums.length; i++){
                if (nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        nextPermutation(nums);
    }
}
