package com.lily.leetcode.medium_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */


public class CombinationSum {

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, target, candidates, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void getResult(List<List<Integer>> result, int target, int candidates[], List<Integer> current, int start){
        if (target>0){
            for (int i = start; i < candidates.length && target >= candidates[i]; i++){
                current.add(candidates[i]);
                getResult(result, target-candidates[i], candidates, current, i);
                current.remove(current.size()-1);
            }
        }
        else if (target == 0){
            result.add(new ArrayList<Integer>(current));
        }
    }

    public static void main(String[] args){
        int[] candidates = new int []{2,3,6,7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
