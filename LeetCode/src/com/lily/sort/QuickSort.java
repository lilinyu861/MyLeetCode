package com.lily.sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int [] arr, int low, int high){
        if(arr.length <= 0) return;
        if(low >= high) return;
        int left=low, right=high, temp = arr[left];
        while(left < right){
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;

        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }

    public static void main(String[] args){
        BubbleSort str = new BubbleSort();
        int [] arr ={1, 4, 9, 5, 6, 3, 2};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
