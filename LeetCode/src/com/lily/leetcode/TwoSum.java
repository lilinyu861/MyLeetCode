package com.lily.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = target - nums[i];
            if(hashTable.containsKey(a)){
                return new int []{hashTable.get(a), i};
            }
            hashTable.put(nums[i], i);
        }
        return null;
    }

    /*
    暴力求解法
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++)
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[j] == target-nums[i])
                    return new int[] {i,j};
            }
            throw new IllegalArgumentException("Don't have suitable number");
    }
    */

    public static void main(String[] args){
        TwoSum a = new TwoSum();
        int nums[] = {2, 5, 8, 4, 1, 10};
        int target = 12;
        int [] out = a.twoSum(nums, target);
        System.out.println(Arrays.toString(out));
    }
}

