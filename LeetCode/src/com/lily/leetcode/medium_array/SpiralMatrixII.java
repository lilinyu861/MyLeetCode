package com.lily.leetcode.medium_array;

import java.util.Arrays;

/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * Example:
 *
 * Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 * Accepted
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rl = 0, rr = n-1;
        int cl = 0, cr = n-1;
        int num = 1;
        while (rl <= rr && cl <= cr) {
            for (int i = cl; i <= cr; i++) {
                res[rl][i] = num++;
            }
            for (int j = rl+1; j <= rr; j++) {
                res[j][cr] = num++;
            }
            for (int i = cr-1; i > cl; i--) {
                res[rr][i] = num++;
            }
            for (int j = rr; j > rl; j--) {
                res[j][cl] = num++;
            }

            rl++;
            rr--;
            cl++;
            cr--;
        }
        return res;
    }


    public static void main(String[] args) {
        int n = 3;
        int[][] result= new int[][]{};
        result = new SpiralMatrixII().generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
