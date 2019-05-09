package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
/*public class MajorityElement {
    private static int majorityElement(int[] nums) {
        for (int i = nums.length-1 ; i > 0 ; i--){
            for (int j=0; j<i; ++j){
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        //System.out.println(Arrays.toString(nums));
        int count = 1;
        for(int i = 0; i<nums.length-1; i++){
            System.out.println(nums.length/2);
            if (nums[i]==nums[i+1])
                count++;
            else{
                if(count > nums.length/2)
                    return nums[i];
                count = 1;
            }
        }
        return 0;
    }
*/
public class MajorityElement {
    private static int majorityElement(int[] nums) {
        int major = nums[0], count=1;
        for (int i = 1; i < nums.length; i++){
            if (count == 0){
                count++;
                major = nums[i];
            }else if (major == nums[i]){
                count ++;
            }else{
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args){
        int [] nums = new int[]{3,2,3};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
