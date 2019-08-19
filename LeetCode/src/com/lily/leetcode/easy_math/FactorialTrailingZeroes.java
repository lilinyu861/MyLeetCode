package com.lily.leetcode.easy_math;

public class FactorialTrailingZeroes {
    /*public int trailingZeroes(int n) {
        long sum = 1;
        int count = 0;
        for (int i = n; i > 0; i--){
            sum = sum * i;
        }
        System.out.println(sum);
        while (sum % 10 == 0){
            sum /= 10;
            count++;
        }
        return count;
    }
    */
    public int trailingZeroes(int n){
        return n == 0?0: n/5 + trailingZeroes(n/5);
    }

    public static void main(String[] args) {
        int n = 13;
        int result = new FactorialTrailingZeroes().trailingZeroes(n);
        System.out.println(result);
    }
}
