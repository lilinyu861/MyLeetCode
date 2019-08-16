package com.lily.leetcode.medium_math;

import java.util.Scanner;

/**
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

 If the fractional part is repeating, enclose the repeating part in parentheses.

 Example 1:

 Input: numerator = 1, denominator = 2
 Output: "0.5"
 Example 2:

 Input: numerator = 2, denominator = 1
 Output: "2"
 Example 3:

 Input: numerator = 2, denominator = 3
 Output: "0.(6)"
 */
public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator%denominator == 0)
            return numerator/denominator+"";
        float r = (float)numerator/denominator;
        String str = r+"";
        return str;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = in.nextInt();
        int denominator = in.nextInt();
        String res = new FractiontoRecurringDecimal().fractionToDecimal(numerator, denominator);
        System.out.println(res);
    }
}
