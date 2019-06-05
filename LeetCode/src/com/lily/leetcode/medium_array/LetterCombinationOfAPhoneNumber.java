package com.lily.leetcode.medium_array;
/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters. *
 * Example:
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {

    private static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits != null || digits.length()>0) loop(ans, "", digits);
        return ans;
    }

    private static void loop(List<String> ans, String current, String digits){
        if (current.length() == digits.length()){
            ans.add(current);
            return ;
        }

        int index = digits.charAt(current.length())-'0';
        for (int i = 0; i < map[index].length(); i++){
            loop(ans, current+map[index].charAt(i), digits);
        }
    }

    public static void main(String[] args){
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
