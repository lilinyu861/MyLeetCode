package com.lily.leetcode.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static int [] insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

//        InsertSort str = new InsertSort();
//        int [] arr = {1, 4, 9, 5, 6, 3, 2};
        int [] result = insertSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
