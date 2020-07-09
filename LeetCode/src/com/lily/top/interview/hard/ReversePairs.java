package com.lily.top.interview.hard;

import com.sun.xml.internal.rngom.digested.DValuePattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [7,5,6,4]
 * 输出: 5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReversePairs {

    // 暴力求解，超时
    public int reversePairs(int[] nums) {
        if (nums.length <= 1) return 0;
        int res = 0;
        for (int i = 0; i < nums.length-1; i++)
        {
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] > nums[j]) res++;
            }
        }
        return res;
    }

    // 归并排序
    public int reversePairs1(int[] nums) {
        return merge(nums, 0, nums.length - 1);
    }

    int merge(int[] arr, int start, int end) {
        if (start == end) return 0;
        int mid = (start + end) / 2;
        int count = merge(arr, start, mid) + merge(arr, mid + 1, end);

        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            count += arr[i] <= arr[j] ? j - (mid + 1) : 0;
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            count += j - (mid + 1);
            temp[k++] = arr[i++];
        }
        while (j <= end)
            temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, start, end - start + 1);
        return count;
    }
}
