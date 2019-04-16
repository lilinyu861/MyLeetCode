package com.lily.leetcode.sort;

import java.util.Arrays;

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
        InsertSort str = new InsertSort();
        int [] arr = {1, 4, 9, 5, 6, 3, 2};
        int [] result = insertSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
