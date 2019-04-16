/*
 * 题目：
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 找到两个排序数组的中位数，时间复杂度为O(log(m+n))
 * 第一种方法：使用暴力求解方法，将两个数组合并排序后找到中位数，其时间复杂度为O（m+n）
 *
 * 第二种方法：找两个已排序的中位数，其实可以看成找第k个小的数字，使用二分法。
 *
 */
package com.lily.leetcode.easy_array;

public class MedianofTwoSortedArrays {
    /* 方法一：暴力求解
    public double findMedianSortedArrays(int[] A, int[] B) {
        int alen = A.length, blen = B.length;
        int len = alen + blen;
        int[] C = new int[len];
        for(int i=0; i<len; i++){
            if(i<alen) C[i] = A[i];
            else C[i] = B[i-alen];
        }
        Arrays.sort(C);
        if(len%2 == 0){
            return (double) (C[len/2]+C[len/2-1])/2;
        }
        else return C[len/2];
    }
    */

    //方法二：使用切分的方法，然后使用二分法
    public double findMedianSortedArrays(int[] A, int[] B){
        int alen = A.length, blen = B.length;
        int len = alen + blen;
        return 2.0;
    }


    //测试代码
    public static void main(String[] args){
        MedianofTwoSortedArrays arr = new MedianofTwoSortedArrays();
        int [] A = {1, 3};
        int [] B = {2, 4};
        double median = arr.findMedianSortedArrays(A, B);
        System.out.println(median);

    }
}
