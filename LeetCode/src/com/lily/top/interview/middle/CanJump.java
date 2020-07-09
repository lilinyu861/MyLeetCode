package com.lily.top.interview.middle;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个位置。
 *
 * 示例 1:
 *
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 *
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CanJump {

    /**
     * 思路：使用贪心算法，x+nums[x]≥y时，认为用户可到达。
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int jumpLen = 0;
        for (int i = 0; i < len; i++) {
            if (i <= jumpLen) {
                jumpLen = Math.max(nums[i] + i, jumpLen);
                if (jumpLen >= len - 1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};//true
        int[] arr2 = {3,2,1,0,4};//false
        int[] arr3 = {0,1};//false
        int[] arr4 = {2,5,0,0};//true
        int[] arr5 = {0,2,3};//false
        System.out.println(canJump(arr5));
    }
}
