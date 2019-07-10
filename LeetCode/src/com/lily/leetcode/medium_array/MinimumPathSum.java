package com.lily.leetcode.medium_array;

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    /*
    public int minPathSum(int[][] grid) {
        return caculate(grid, 0, 0);
    }

    private int caculate(int[][] grid, int i , int j ){
        if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        if (i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        return grid[i][j]+Math.min(caculate(grid, i+1, j), caculate(grid, i, j+1));
    }
*/
    public int minPathSum(int[][] grid){
        int[][] res = new int[grid.length][grid[0].length];
        for (int i = grid.length-1; i >= 0; i--){
            for (int j = grid[0].length-1; j>=0; j--){
                if (i == grid.length-1 && j!=grid[0].length-1)
                    res[i][j] = grid[i][j]+res[i][j+1];
                else if (i != grid.length-1 && j == grid[0].length-1)
                    res[i][j] = grid[i][j]+res[i+1][j];
                else if (i != grid.length-1 && j!=grid[0].length-1)
                    res[i][j] = grid[i][j]+Math.min(res[i+1][j],res[i][j+1]);
                else res[i][j] = grid[i][j];
            }
        }
        return res[0][0];
    }

    public static void main(String[] args) {
        int [][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int result = new MinimumPathSum().minPathSum(grid);
        System.out.println(result);
    }
}
