/* *
 * 题目：
 * 给定一个字符串，找到最长子字符串的长度而不重复字符。
 * 解题思路：
 *      利用hashMap，将不存在于map中的字符存放到map中，然后比较max和hashMap的长度，去最长值
 *      若字符已经在map中，则回到map中移除数据，从头开始移除。
 *      比较完成之后最后的结果时hashMap和set相比的最大值。
 */
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
