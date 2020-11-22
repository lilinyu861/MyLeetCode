package cn.lily.leetcode.sort;

import java.util.Arrays;
import java.util.Scanner;

// 直接插入排序 时间复杂度O(n^2),空间复杂度O(1) 稳定
public class InsertionSort {
    public static void insertionSort(int[] nums){
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
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(" "+ nums[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        insertionSort(nums);
    }
}
