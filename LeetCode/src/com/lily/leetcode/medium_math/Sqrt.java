package com.lily.leetcode.medium_math;

/**
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example 1:
 *
 * Input: 4
 * Output: 2
 * Example 2:
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 *              the decimal part is truncated, 2 is returned.
 */
public class Sqrt {
    int s;
    public int mySqrt(int x) {
        s = x;
        if (x == 0) return 0;
        return ((int)sqrts(x));
    }

    private double sqrts(double x){
        double res = (x+s/x)/2;
        if (res == x){
            return x;
        }
        else return sqrts(res);
    }

    public static void main(String[] args) {
        int x = 8;
        int result = new Sqrt().mySqrt(x);
        System.out.println(result);
    }
}
