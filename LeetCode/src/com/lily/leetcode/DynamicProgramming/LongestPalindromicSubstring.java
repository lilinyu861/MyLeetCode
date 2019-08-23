package com.lily.leetcode.DynamicProgramming;
/**
 * 回文字串问题
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example 1:

 Input: "babad"
 Output: "bab"
 Note: "aba" is also a valid answer.
 Example 2:

 Input: "cbbd"
 Output: "bb"
 */

import java.util.Arrays;
import java.util.Scanner;
// 解法一：暴力求解，列出所有字串，判断字串是否是回文字符串
// 解法二：将字符串s反转，求最长公共字串，判断此最长公共字串是否就是要找的最长回文子串
// 解法三：动态规划，
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length()<2) return s;
        int len = s.length();
        int max = 0;
        int start = 0, end = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++){
            for (int j = 0; j <= i; j++){
                if (s.charAt(i) == s.charAt(j) && (i-j <=2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                }
                if (dp[j][i] && max < i-j+1){
                    max = i-j+1;
                    start = j;
                    end = i;
                }
            }
        }
        // 最长回文字串长度
        System.out.println(max);
        return s.substring(start, end+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = new LongestPalindromicSubstring().longestPalindrome(s);
        System.out.println(result);
    }
}
