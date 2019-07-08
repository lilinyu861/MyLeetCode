package com.lily.leetcode.medium_array;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * How many possible unique paths are there?
 * Note: m and n will be at most 100.
 *
 * Example 1:
 *
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * Example 2:
 *
 * Input: m = 7, n = 3
 * Output: 28
 */
public class UniquePaths {
    /*
    public int uniquePaths(int m, int n) {
        int res = factorial(m+n-2)/factorial(m-1)/factorial(n-1);
        return res;
    }

    public int factorial(int num){
        if (num == 1) return 1;
        else return factorial(num-1)*num;
    }
*/
    // 动态规划的方法，若点tmp（i，j）可达，则tmp（i-1， j）或tmp（i，j-1）可达
    public int uniquePaths(int m, int n){
        int [][] tmp = new int[m][n];
        for (int i = 0; i < m; i++) tmp[i][0] = 1;
        for (int i = 0; i < n; i++) tmp[0][i] = 1;
        for (int i = 1 ; i < m; i++){
            for(int j = 1; j < n; j++){
                tmp[i][j] = tmp[i-1][j] + tmp[i][j-1];
            }
        }
        return tmp[m-1][n-1];
    }

    public static void main(String[] args) {
        int m = 7, n = 3;
        int result = new UniquePaths().uniquePaths(m,n);
        System.out.println(result);
    }
}
