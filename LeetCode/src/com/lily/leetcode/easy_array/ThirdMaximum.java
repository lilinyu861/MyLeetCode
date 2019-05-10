package com.lily.leetcode.easy_array;

import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 *
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 *
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaximum {
    //先排序，然后找到第三大的数值
    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 1;
        for (int i= nums.length-1; i>0; i--){
            if (nums[i]!=nums[i-1]){
                count++;
                if (count ==3)
                    return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    //遍历一次，时间复杂度为O（n），找出第一大、第二大和第三大的数值，若第三大的值存在，则返回第三大的值，若第三大的值不存在，则返回最大值。
    private static int thirdMax2(int[] nums){
        long first = Long.MIN_VALUE, second = first, third = first;
        for (int i = 0; i<nums.length; i++){
            if (first < nums[i]){
                third = second;
                second = first;
                first = nums[i];
            }else if(second<nums[i] && nums[i]!=first){
                third = second;
                second = nums[i];
            }else if(third < nums[i] && nums[i]!=second && nums[i]!=first){
                third = nums[i];
            }
        }
        return third==Long.MIN_VALUE?(int)first:(int)third;

    }

    public static void main(String[] args){
        int[] nums = new int[]{2, 1};
//        int result = thirdMax(nums);
        int result = thirdMax2(nums);
        System.out.println(result);
    }
}
