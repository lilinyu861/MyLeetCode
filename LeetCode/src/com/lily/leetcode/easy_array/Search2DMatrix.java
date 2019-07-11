package com.lily.leetcode.easy_array;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 * Example 2:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 */
public class Search2DMatrix {
    /*
    //一次遍历直接找到值
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
    */

    //二分法
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length * matrix[0].length;
        int left = 0, right = len-1;
        if (len == 0) return false;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (value == target) return true;
            else {
                if (target < value) {
                    right = mid-1;
                }
                else{
                    left = mid +1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int target = 3;
        Boolean result = new Search2DMatrix().searchMatrix(matrix, target);
        System.out.println(result);
    }
}
