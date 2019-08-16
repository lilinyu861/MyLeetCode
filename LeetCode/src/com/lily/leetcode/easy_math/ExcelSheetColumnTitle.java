package com.lily.leetcode.easy_math;

import java.util.Scanner;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 ...
 Example 1:

 Input: 1
 Output: "A"
 Example 2:

 Input: 28
 Output: "AB"
 Example 3:

 Input: 701
 Output: "ZY"
 Accepted
 180.4K
 Submissions
 614.5K
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuffer str = new StringBuffer();
        while (n > 0){
            int k = n % 26;
            if (k == 0){
                n = n - 26;
                k = 26;
            }
            char c = (char)((k-1)+(int)'A');
            str.insert(0, c);
            n = n /26;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = new ExcelSheetColumnTitle().convertToTitle(n);
        System.out.println(res);
    }
}
