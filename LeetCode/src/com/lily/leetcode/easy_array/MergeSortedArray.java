package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    // 先将两个数列nums1和nums2合并到nums1中，然后进行冒泡排序
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m, j=0; i<nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        for (int i=m; i>0; i--){
            for (int j=0; j<i; j++)
            {
                if (nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    //从后向前比较，将数组后向前排序，先找到最大值，依次减小
    private static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i>=0 && j >=0){
            nums1[k--] = nums1[i]>nums2[j] ? nums1[i--]:nums2[j--];
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args){
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int [] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
//        merge(nums1, m, nums2, n);
        merge1(nums1, m, nums2, n);
    }
}
