package com.lily.leetcode.medium_array;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 *
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 *
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 *
 * Note:
 *
 * Given n will be between 1 and 9 inclusive.
 * Given k will be between 1 and n! inclusive.
 * Example 1:
 *
 * Input: n = 3, k = 3
 * Output: "213"
 * Example 2:
 *
 * Input: n = 4, k = 9
 * Output: "2314"
 */

public class PermutationSequence {
    // 回溯法求出解，然后转化成String
    public String getPermutation(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        int[] visited = new int[n];
        int start = 0;
        listSon(res, nums, new ArrayList<>(), visited);
        List<Integer> result = res.get(k-1);
        StringBuilder str = new StringBuilder();
        for (Integer i : result){
            str.append(i);
        }
        return str.toString();
    }

    private void listSon(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp_list, int[] visited){
        if (tmp_list.size() == nums.length){
            res.add(new ArrayList<>(tmp_list));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (visited[i] == 1){
                continue;
            }
            visited[i] = 1;
            tmp_list.add(nums[i]);
            listSon(res, nums, tmp_list, visited);
            visited[i] = 0;
            tmp_list.remove(tmp_list.size()-1);
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int k = 116907;
        String result = new PermutationSequence().getPermutation(n, k);
        System.out.println(result);
    }
}
