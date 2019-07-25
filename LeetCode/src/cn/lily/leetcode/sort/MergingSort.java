package cn.lily.leetcode.sort;

import java.util.Arrays;
// 归并排序， 递归  时间复杂度O(nlog2n) 空间复杂度O(n) 不稳定
public class MergingSort {
    public int[] merginSort(int[] nums) {
        if (nums.length <=1) return nums;
        int len = nums.length >> 1;
        int[] leftArr = Arrays.copyOfRange(nums, 0, len);
        int[] rightArr = Arrays.copyOfRange(nums, len, nums.length);
        return mergeArr(merginSort(leftArr), merginSort(rightArr));
    }

    private int[] mergeArr(int[] leftArr, int[] rightArr){
        int i=0, j=0, k=0;
        int[] res = new int[leftArr.length+rightArr.length];
        while (i < leftArr.length && j < rightArr.length){
            if (leftArr[i] <= rightArr[j]) res[k++] = leftArr[i++];
            else res[k++] = rightArr[j++];
        }
        while (i < leftArr.length) res[k++] = leftArr[i++];
        while (j < rightArr.length) res[k++] = rightArr[j++];

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 3, 6, 5, 3, 2};
        int[] result = new MergingSort().merginSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
