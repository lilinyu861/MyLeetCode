package cn.lily.leetcode.sort;

import java.util.Arrays;
// 快速排序， 迭代 时间复杂度O（nlog2n) 空间复杂度O（1） 不稳定
public class QuickSort {
    public int[] quickSort(int[] nums, int low, int high){
        if (low>high) return null;
        int left = low, right = high, temp = nums[left];
        while (left < right){
            while (left<right && nums[right] >= temp){
                right--;
            }
            nums[left] = nums[right];
            while (left<right && nums[left] <= temp){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = temp;
        quickSort(nums, low, left-1);
        quickSort(nums, left+1, high);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        int[] result = new QuickSort().quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(result));
    }
}
