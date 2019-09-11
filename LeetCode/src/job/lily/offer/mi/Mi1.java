package job.lily.offer.mi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(removeStr(str1,str2));
    }

    public static String removeStr(String str1, String str2){
        if (str1.length() < 1) return null;
        if (str2.length() < 1) return str1;
        String res = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++){
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i),0)+1);
        }
        for (int i = 0; i < str1.length(); i++){
            if (map.containsKey(str1.charAt(i)))
                continue;
            else res += str1.charAt(i);
        }
        return res;
    }
//        public static String removeStr(String str1, String str2){
//            if (str1.length() < 1) return null;
//            char [] arr1 = str1.toCharArray();
//            char [] arr2 = str2.toCharArray();
//            for (int i = 0; i < str1.length(); i++){
//                for (int j = 0; j < str2.length(); j++){
//                    if (arr1[i] == arr2[j])
//                        arr1[i] = ' ';
//                }
//            }
//            StringBuffer res = new StringBuffer();
//            for (int i = 0; i < str1.length(); i++){
//                if (arr1[i] != ' ') res.append(arr1[i]);
//            }
//
//            return res.toString();
//        }
}
