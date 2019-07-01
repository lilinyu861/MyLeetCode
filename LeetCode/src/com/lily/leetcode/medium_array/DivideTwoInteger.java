package com.lily.leetcode.medium_array;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Example 2:
 *
 * Input: dividend = 7, divisor = -3
 * Output: -2
 */
public class DivideTwoInteger {
    private static int divide(int dividend, int divisor) {
        int dividend1 = Math.abs(dividend), divisor1 = Math.abs(divisor);
        int count = 0, r = 1;
        while(dividend1 >= divisor1 || r > 1){
            if (dividend1 >= divisor1){
                dividend1 -= divisor1;
                count += r;
                r += r;
                divisor1 += divisor1;
            }
            else{
                r = r >> 1;
                divisor1 = divisor1 >> 1;
            }
        }
        if ((dividend > 0 && divisor < 0) || (dividend <0 && divisor > 0))
            count = -count;
        System.out.println(count);
        return Math.min(Math.max(Integer.MIN_VALUE, count), Integer.MAX_VALUE);
    }

    public static void main(String[] args){
        int dividend = -2147483648;
        int divisor = -1;
        int result = divide(dividend, divisor);
        System.out.println(result);
    }
}
