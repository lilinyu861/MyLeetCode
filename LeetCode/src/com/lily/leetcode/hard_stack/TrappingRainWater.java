package com.lily.leetcode.hard_stack;

import java.util.Stack;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {
    /*
    // 计算每个格子的蓄水能力
    public int trap(int[] height) {
        int res = 0;
        int len = height.length;
        for (int i = 1; i < len-1; i++){
            int max_left = 0, max_right = 0;
            for (int j=i; j>=0; j--){
                max_left = max(max_left,height[j]);
            }
            for (int j = i; j < len; j++){
                max_right = max(max_right, height[j]);
            }
            res += min(max_left, max_right)-height[i];
        }
        return res;
    }
    */
    /*
    // 双指针
    public int trap(int[] height) {
        int res=0, max_left=0,max_right=0;
        int left=1, right=height.length-2;
        for (int i = 1; i < height.length-1; i++){
            if (height[left-1] < height[right+1]){
                max_left = Math.max(max_left, height[left-1]);
                int min = max_left;
                if (min>height[left]) res+=(min-height[left]);
                left++;
            }
            else{
                max_right = Math.max(max_right, height[right+1]);
                int min = max_right;
                if (min>height[right]) res+=(min-height[right]);
                right--;
            }
        }
        return res;
    }
*/
    //栈
    public int trap(int[] height){
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current<height.length){
            while (!stack.empty() && height[current]>height[stack.peek()]){
                int h = height[stack.peek()];
                stack.pop();
                if (stack.empty()) break;
                int distance = current-stack.peek()-1;
                int min = Math.min(height[stack.peek()], height[current]);
                res = res+distance*(min-h);
            }
            stack.push(current);
            current++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result = new TrappingRainWater().trap(height);
        System.out.println(result);
    }
}
