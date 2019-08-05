package com.lily.leetcode.medium_tree;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 1; j <=i; j++){
                G[i] += G[j-1]*G[i-j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        int n = 3;
        int result = new UniqueBinarySearchTrees().numTrees(n);
        System.out.println(result );
    }
}
