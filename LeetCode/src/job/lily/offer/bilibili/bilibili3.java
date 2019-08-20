package job.lily.offer.bilibili;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bilibili3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(findSubString(s, t));
    }

    public static String findSubString(String s, String t){
        Map<Character, Integer> m = new HashMap<>();
        for (Character c: t.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        int begin = 0, end = 0, head = 0;
        int d = Integer.MAX_VALUE;
        int counter = t.length();
        while (end < s.length()){
            Character end_c = s.charAt(end);
            if (m.getOrDefault(end_c, 0) > 0)
                counter--;
            m.put(end_c, m.getOrDefault(end_c, 0) - 1);
            end++;
            while (counter == 0){
                Character begin_c = s.charAt(begin);
                if (end - begin < d){
                    d = end - (head = begin);
                }
                if (m.getOrDefault(begin_c, 0) == 0) counter++;
                m.put(begin_c, m.getOrDefault(begin_c, 0)+1);
                begin++;
            }
        }
        return d == Integer.MAX_VALUE ? "#":s.substring(head, head+d);
    }
}
