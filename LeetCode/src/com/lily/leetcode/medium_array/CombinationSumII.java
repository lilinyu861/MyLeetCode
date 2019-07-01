package com.lily.leetcode.medium_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * Each number in candidates may only be used once in the combination.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,5,2,1,2], target = 5,
 * A solution set is:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */
public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        listSon(res, candidates, target, 0, 0, new ArrayList<>());
        return res;
    }

    private static void listSon(List<List<Integer>> res, int [] candidates, int target, int i, int tem_sum, ArrayList<Integer> tem_list){
        if (tem_sum == target){
            res.add(new ArrayList<>(tem_list));
            return;
        }
        for (int start = i; start<candidates.length; start++){
            if (tem_sum+candidates[start] > target) break;
            if (start > i && candidates[start]==candidates[start-1]) continue;
            tem_list.add(candidates[start]);
            listSon(res, candidates, target, start+1, tem_sum+candidates[start], tem_list);
            tem_list.remove(tem_list.size()-1);
        }

    }

    public static void main(String[] args){
        int[] candidates = new int []{2,3,6,7};
        int target = 9;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(result);
    }
}
