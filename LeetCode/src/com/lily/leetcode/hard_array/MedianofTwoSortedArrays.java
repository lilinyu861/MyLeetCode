package com.lily.leetcode.hard_array;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 You may assume nums1 and nums2 cannot be both empty.

 Example 1:

 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:

 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 使得nums1的长度小于nums2
        int m = nums1.length;
        int n = nums2.length;
        if(m > n){
            int [] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int tmp = m; m = n; n = tmp;
        }

        // 找到maxLeft和minRight
        int iMin = 0, iMax = m, halfLen = (m+n+1)/2;
        while (iMin <= iMax){
            int i = (iMin+iMax)/2;
            int j = halfLen-i;
            if (i > iMin && nums1[i-1] > nums2[j]) iMax = i-1;
            else if(i < iMax && nums1[i] < nums2[j-1]) iMin = i + 1;
            else{
                int maxLeft = 0;
                if( i == 0) maxLeft = nums2[j-1];
                else if(j == 0) maxLeft = nums1[i-1];
                else{
                    maxLeft = Math.max(nums1[i-1], nums2[j-1]);
                }
                if ((m + n)%2 == 1) return maxLeft;

                int minRight = 0;
                if (i == m) minRight = nums2[j];
                else if(j == n) minRight = nums1[i];
                else minRight = Math.min(nums1[i], nums2[j]);

                return (maxLeft+minRight)/2.0;
            }
        }
        return  0.0;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        double res = new MedianofTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
