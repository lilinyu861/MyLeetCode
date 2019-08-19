package com.lily.leetcode.hard_array;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num:nums){
            if (i < 2 || num > nums[i-2])
                nums[i++] = num;
        }
        return i;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int result = new RemoveDuplicatesFromSortedArrayII().removeDuplicates(nums);
        System.out.println(result);
    }
}
