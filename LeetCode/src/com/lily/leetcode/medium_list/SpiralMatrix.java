package com.lily.leetcode.medium_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * Example 1:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 *
 * Input:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        // r 行，c 列
        int rl = 0, rr = matrix.length-1;
        int cl = 0, cr = matrix[0].length-1;
        while(rl<=rr && cl<=cr){
            //从左到右，行不变
            for (int c = cl;  c <= cr; c++){
                res.add(matrix[rl][c]);
            }
            // 从上到下，列不变
            for (int r = rl+1; r <= rr; r++){
                res.add(matrix[r][cr]);
            }
            if (rl < rr && cl < cr){
                //从右到左，行不变
                for (int c = cr-1; c>cl; c--) res.add(matrix[rr][c]);
                //从下向上，列不变
                for (int r = rr; r>rl; r--) res.add(matrix[r][cl]);
            }
            rl++;
            rr--;
            cl++;
            cr--;
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3,4},{5,6,7,8}};
        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);
        System.out.println(result.toString());
    }
}
