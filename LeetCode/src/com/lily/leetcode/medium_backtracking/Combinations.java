package com.lily.leetcode.medium_backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given two integers n and k,
 * return all possible combinations of k numbers out of 1 ... n.
 *
 * Example:
 *
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class Combinations {

    // 回溯法解决问题
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res  = new ArrayList<>();
        help(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    private List<List<Integer>> help(List<List<Integer>> res, List<Integer> tmp, int start, int n, int k){
        if (tmp.size() == k) res.add(new ArrayList<>(tmp));
        for (int i = start; i < n+1; i++){
            tmp.add(i);
            help(res, tmp, i+1, n, k);
            tmp.remove(tmp.size()-1);
        }
        return res;
    }



    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> result = new ArrayList<>();
        result = new Combinations().combine(n,k);
        System.out.println(result.toString());
    }
}
