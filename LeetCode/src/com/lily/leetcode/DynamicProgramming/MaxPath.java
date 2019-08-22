package com.lily.leetcode.DynamicProgramming;

public class MaxPath {
    public static int maxPath(int [][] nums){
        int m = nums.length-1, n = nums[0].length-1;
        for (int i = m-1; i >= 0; i--){
            nums[i][n] += nums[i+1][n];
        }

        for (int j = n-1; j>= 0; j--){
            nums[m][j] += nums[m][j+1];
        }

        for (int i = m-1; i >=0 ; i --){
            for (int j = n-1; j >=0; j--){
                nums[i][j] = Math.max(nums[i][j] + nums[i][j+1], nums[i][j] + nums[i+1][j]);
            }
        }
        return nums[0][0];
    }

    public static void main(String[] args) {
        int [][] nums = {{1,2,3,4},{3,3,2,1},{2,2,3,2}};
        int result = new MaxPath().maxPath(nums);
        System.out.println(result);
    }
}
