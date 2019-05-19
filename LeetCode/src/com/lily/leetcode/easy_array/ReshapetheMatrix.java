package com.lily.leetcode.easy_array;

import java.util.Arrays;

/**
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 *
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 *
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 *
 * Example 1:
 * Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 * Explanation:
 * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
 * Example 2:
 * Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 2, c = 4
 * Output:
 * [[1,2],
 *  [3,4]]
 * Explanation:
 * There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
 */
public class ReshapetheMatrix {
    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m*n != r*c) return nums;
        int[][] result = new int[r][c];
        for (int i = 0; i < r*c; i++){
            result[i/c][i%c]=nums[i/n][i%n];
        }
        return result;
    }

    public static void main(String[] args){
        int[][] nums = new int[][]{{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] result = new int[2][2];
        result = matrixReshape(nums,r,c);
        for (int i = 0; i<r; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
