package com.lily.leetcode.easy_array;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 */
public class CountandSay {
    private static String countAndSay(int n) {
        String str = "1";
        for (int i =2 ; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char pre = str.charAt(0);
            for (int j = 1; j < str.length(); j++){
                if (str.charAt(j) == pre){
                    count++;
                }else{
                    sb.append(count).append(pre);
                    pre = str.charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(pre);
            str = sb.toString();
        }
        return str;
    }


    public static void main(String[] args){
        int n = 4 ;
        String result = countAndSay(n);
        System.out.println(result);
    }
}
