package com.lily.leetcode.sort;

import java.util.Arrays;

public class SelectionSort {
    public static int [] selectionSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        SelectionSort str = new SelectionSort();
        int [] arr = {1, 4, 9, 5, 6, 3, 2};
        int [] result = selectionSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
