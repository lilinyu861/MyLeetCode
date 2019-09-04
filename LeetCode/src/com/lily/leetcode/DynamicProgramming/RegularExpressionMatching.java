package com.lily.leetcode.DynamicProgramming;

import java.util.Scanner;

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
       boolean[][] dp = new boolean[s.length()+1][p.length()+1];
       dp[s.length()][p.length()] = true;
       int i = s.length()-1;
       while (i >= 0){
           for (int j = p.length()-1; j >= 0; j--){
               dp[i][j] = (s.charAt(i) == s.charAt(j))||s.charAt(j)=='.'||
                       (s.charAt(j) == '*' && dp[i][j-1]);
               if (!dp[i][j]) return false;
               i--;
           }
       }
       return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        Boolean result = new RegularExpressionMatching().isMatch(s, p);
        System.out.println(result);
    }
}
