package com.lily;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(i<s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i++);
                max = Math.max(max, map.size());
            }
            else{
                map.remove(s.charAt(j++));
            }
    }
    return max;
}

    //测试代码
    public static void main(String[] args){
        LongestSubstring str = new LongestSubstring();
        String s = "abcabcdde";
        int num = str.lengthOfLongestSubstring(s);
        System.out.println(num);
    }
}
