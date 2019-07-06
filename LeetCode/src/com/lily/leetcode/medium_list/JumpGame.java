package com.lily.leetcode.medium_list;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * Example 1:
 *
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 *              jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame {
    /*
    //回溯法，超时
    public boolean canJump(int[] nums) {
        return canJumpFur(0, nums);
    }

    public boolean canJumpFur(int position, int[] nums){
        if (position == nums.length-1) return true;
        int maxJump = Math.min(position+nums[position], nums.length-1);
        for (int nextPosition = maxJump; nextPosition > position; nextPosition--){
            if (canJumpFur(nextPosition, nums)) return true;
        }
        return false;
    }
*/
    //贪心算法
    public boolean canJump(int[] nums){
        int lastPos = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--){
            if (i+nums[i] >= lastPos)
                lastPos = i;
        }
        return lastPos==0;
    }
    public static void main(String[] args) {
        int [] nums = new int[]{2,3,1,1,4};
        Boolean result = new JumpGame().canJump(nums);
        System.out.println(result);
    }
}
