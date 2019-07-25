package cn.lily.leetcode.sort;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] nums){
        int len = nums.length;
        for (int i = len-1; i>=0; i--){
            for (int j=0; j<i; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        BubbleSort res = new BubbleSort();
        res.bubbleSort(nums);
    }
}

