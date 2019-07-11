package com.lily.leetcode.medium_array;

import java.util.*;

/**
 * Given a m x n matrix, if an element is 0,
 * set its entire row and column to 0. Do it in-place.
 *
 * Example 1:
 *
 * Input:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * Output:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 * Example 2:
 *
 * Input:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * Output:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 */
public class SetMatrixZeroes {
    /*
    //两次遍历，第一次记录值为0的行号和列号（使用set，避免重复），第二次置零，但是空间复杂度为O（n）
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < row; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    */

    //暴力，设置标记数据，空间复杂度为O(1)
    public void setZeroes(int[][] matrix) {
        int MODIFY = -1000000;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == 0){
                    for (int k = 0; k < row; k++){
                        if (matrix[k][j] != 0) matrix[k][j] = MODIFY;
                    }
                    for (int k1 = 0; k1 < col; k1++){
                        if (matrix[i][k1] != 0) matrix[i][k1] = MODIFY;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == MODIFY) matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < row; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int [][] result = new int[][]{};
        new SetMatrixZeroes().setZeroes(matrix);
    }

}
