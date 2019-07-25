package cn.lily.leetcode.sort;

import java.util.Arrays;
//选择排序 时间复杂度O（n^2) 空间复杂度O(1) 不稳定
public class SelectionSort {
    public void selectionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            int min = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] < nums[min]) min=j;
            }
            if (min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        new SelectionSort().selectionSort(nums);
    }
}
