package com.lily.sort;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int [] arr){
        for(int i = arr.length; i>0; i--) {
            int max_heap = Integer.MIN_VALUE;
            int min_heap = Integer.MAX_VALUE;

            int temp = arr[0];
            arr[0] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    private static void max_heapify(int [] arr, int limit){
        if(arr.length <= 0 || arr.length < limit) return;
        for(int parentIdx = limit/2; parentIdx>=0; parentIdx--){
            if(parentIdx * 2 >= limit)
                continue;
            int left = parentIdx*2;
            int right = (left+1) >= limit ? left:(left+1);
            int maxChildId = arr[left] >= arr[right]?left:right;
            if(arr[maxChildId]> arr[parentIdx]){
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
    }
    public static void main(String[] args){
        BubbleSort str = new BubbleSort();
        int [] arr ={1, 4, 9, 5, 6, 3, 2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
