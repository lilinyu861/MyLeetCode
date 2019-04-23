package com.lily.leetcode.easy_array;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

import java.util.Arrays;

public class PlusOne {
    private static int[] plusOne(int[] digits) {
        int len1 = digits.length;
        for(int i=len1-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] result = new int[len1+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args){
        int[] digits = new int[]{1,9,9};
        int results[] = plusOne(digits);
        System.out.println(Arrays.toString(results));
    }
}
