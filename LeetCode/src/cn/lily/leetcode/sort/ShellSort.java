package cn.lily.leetcode.sort;

import java.util.Arrays;

public class ShellSort {
    public void shellSort(int[] nums){
        for (int gap = nums.length/2; gap>0; gap/=2){
            for (int i = 0; (i+gap) < nums.length; i++){
                for (int j = i; (j+gap)<nums.length; j += gap){
                    if (nums[j] > nums[j+gap]){
                        int temp = nums[j];
                        nums[j] = nums[j+gap];
                        nums[j+gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        new ShellSort().shellSort(nums);
    }
}
