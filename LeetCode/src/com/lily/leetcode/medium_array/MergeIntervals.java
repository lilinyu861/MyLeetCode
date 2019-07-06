package com.lily.leetcode.medium_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 *
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 *
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0) return res.toArray(new int[0][]);
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        int i = 0;
        while (i < intervals.length){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i < intervals.length-1 && intervals[i+1][0] <= right){
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            res.add(new int[]{left, right});
            i++;

        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int [][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int [][] result = new int[][]{};
        result = new MergeIntervals().merge(intervals);
        for (int i = 0; i<result.length; i++){
            System.out.print(Arrays.toString(result[i]));
        }
    }
}
