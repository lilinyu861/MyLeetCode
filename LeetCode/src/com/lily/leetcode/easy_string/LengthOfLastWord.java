package com.lily.leetcode.easy_string;

import java.util.Arrays;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {
    //字符串转数组，然后计算数组最后一个字符串的长度 -超时！
    /*
    public int lengthOfLastWord(String s) {
        if (s.length() == 0 || s == " ") return 0;
        String [] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        return str[str.length-1].length();
    }
*/
    // 字符串从后向前遍历，直到遍历完最后一个单词的值之后停下。
    public int lengthOfLastWord(String s){
        int len = s.length(), num = 0;
        while(len > 1 && s.charAt(len-1) == ' '){
            len--;
        }
        for (int i = len-1; i >= 0; i--){
            if (s.charAt(i) == ' ') return num;
            else num++;
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "Hello world";
        int result = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(result);
    }
}
