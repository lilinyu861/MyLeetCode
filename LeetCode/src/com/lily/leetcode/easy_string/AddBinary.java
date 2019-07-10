package com.lily.leetcode.easy_string;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int add = 0;
        for (int i = a.length()-1, j = b.length()-1; i >=0 || j>=0; i--, j--){
            int sum = add;
            // 判断i>=0?和j>=0?是由于a和b的长度不一致
            sum += i >= 0 ? a.charAt(i)-'0':0;
            sum += j >= 0 ? b.charAt(j)-'0':0;
            res.append(sum%2);
            add = sum/2;
        }
        res.append(add==0?"":add);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        String result = new AddBinary().addBinary(a,b);
        System.out.println(result);
    }
}
