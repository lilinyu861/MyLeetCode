package com.lily.leetcode.medium_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 *
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */
//使用回溯法
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //visited数组中的值只有0，1，0表示未被访问，1表示已被访问
        int [] visited = new int[nums.length];
        listSon(res, nums, new ArrayList<>(), visited);
        return res;
    }

    private void listSon(List<List<Integer>> res, int [] nums, ArrayList<Integer> tmp_list, int[] visited){
        if (tmp_list.size() == nums.length){
            res.add(new ArrayList<>(tmp_list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //若当前数字已经被加入到tmp_list中，则继续。
            if (visited[i] == 1) continue;
            visited[i] = 1;
            tmp_list.add(nums[i]);
            listSon(res, nums, tmp_list, visited);
            visited[i] = 0;
            tmp_list.remove(tmp_list.size()-1);
        }
    }


    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        Permutations per = new Permutations();
        List<List<Integer>> result = new ArrayList<>();
        result = per.permute(nums);
        System.out.println(result);
    }
}
