package com.lily.leetcode.easy_array;

import java.util.ArrayList;
import java.util.List;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 *
 * Example 1:
 *
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 *
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 */
public class FibonacciNumber {
    // 递归解法
    private static int fib(int N) {
        if (N<0) return -1;
        else if (N==0) return 0;
        else if (N==1) return 1;
        else return fib(N-1)+fib(N-2);
    }

    // 非递归解法
    private static int fib1(int N){
        int[] f = new int[N+1];
        if (f.length>1) f[1] = 1;
        for (int i = 2; i<N+1; i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[N];
    }

    public static void main(String[] args){
        int N = 3;
        int result = fib(N);
        int result1 = fib1(N);
        System.out.println(result);
        System.out.println(result1);
    }
}
