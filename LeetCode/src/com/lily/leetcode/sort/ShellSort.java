package com.lily.leetcode.sort;

import java.util.Arrays;

public class ShellSort {
    public static int [] shellSort(int [] arr){
        int len = arr.length;
        for(int grap = len/2; grap>0; grap = grap/2){
            for(int i = 0 ; i < len-grap; i++){
                for(int j = 0; j < len-grap; j += grap){
                    if(arr[j] > arr[j+grap]){
                        int temp = arr[j];
                        arr[j] = arr[j+grap];
                        arr[j+grap] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        ShellSort str = new ShellSort();
        int [] arr = {1, 4, 9, 5, 6, 3, 2};
        int [] result = shellSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
