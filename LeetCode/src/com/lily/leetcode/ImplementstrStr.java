package com.lily.leetcode;

import javax.imageio.ImageIO;

public class ImplementstrStr {
    private static int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        if(haystack.isEmpty() || haystack.length()<needle.length())
            return -1;
        for(int i = 0; i<= haystack.length()-needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if (needle.equals(haystack.substring(i, i+needle.length())))
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String haystack = "a";
        String needle = "a";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
