package cn.lily.leetcode.sort;

import java.util.Arrays;
// 直接插入排序 时间复杂度O(n^2),空间复杂度O(1) 稳定
public class InsertionSort {
    public void insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int temp = nums[i];
            for (int j = i; j >= 0; j--){
                if (j>0 && nums[j-1]>temp){
                    nums[j] = nums[j-1];
                }
                else{
                    nums[j] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        new InsertionSort().insertionSort(nums);
    }
}
