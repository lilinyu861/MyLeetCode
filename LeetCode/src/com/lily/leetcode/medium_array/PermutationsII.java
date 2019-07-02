package com.lily.leetcode.medium_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * Example:
 *
 * Input: [1,1,2]
 * Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int [] visited = new int[nums.length];
        listSon(res, nums, new ArrayList<>(), visited);
        return res;
    }

    private void listSon(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp_list, int[] visited){
        if (tmp_list.size() == nums.length){
            res.add(new ArrayList<>(tmp_list));
            return;
        }

        for (int i = 0; i<nums.length; i++){
            //这里增加判断，去除重复列
            if (visited[i] == 1 || (i>0 && nums[i] == nums[i-1] && visited[i-1] == 1)){
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
        int [] nums = {1, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        result = new PermutationsII().permuteUnique(nums);
        System.out.println(result);
    }
}
