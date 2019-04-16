package com.lily.leetcode.sort;

import java.util.Arrays;

public class BubbleSort {
    public static int [] bubbleSort(int [] arr){
        for(int i = arr.length - 1; i > 0; --i){
            for (int j = 0; j < i; ++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        BubbleSort str = new BubbleSort();
        int [] arr ={1, 4, 9, 5, 6, 3, 2};
        int[] a = bubbleSort(arr);
        System.out.println(Arrays.toString(a));
    }
}
