package com.lily.sort;

import java.util.Arrays;

public class MergeSort {
    public static int [] mergeSort(int [] arr){
        if(arr.length <= 1) return arr;
        int [] arrleft = Arrays.copyOfRange(arr, 0, arr.length/2);
        int [] arrright = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        return merge(mergeSort(arrleft), mergeSort(arrright));
    }

    private static int [] merge(int [] arrleft, int[] arrright){
        int i = 0, j = 0, k = 0;
        int [] result = new int[arrleft.length + arrright.length];
        while(i<arrleft.length && j<arrright.length){
            if (arrleft[i] <= arrright[j])
                result[k++] = arrleft[i++];
            else
                result[k++] = arrright[j++];
        }
        while(i<arrleft.length){
            result[k++] = arrleft[i++];
        }
        while(j<arrright.length){
            result[k++] = arrright[j++];
        }
        return result;
    }

    public static void main(String[] args){
        MergeSort str = new MergeSort();
        int [] arr = {1, 4, 9, 5, 6, 3, 2};
        int [] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
