package job.lily.offer.qianxin;

import java.util.Scanner;

public class Qianxin2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = longthOfSubstring(str);
        System.out.println(res);
    }

    public static int longthOfSubstring(String str){
        int[] hash = new int[1000];
        int m = 0;
        int n = 0;
        int max = 0;
        while (m < str.length() && n < str.length()){
            if (hash[str.charAt(m)] == 0){
                hash[str.charAt(m)] = 1;
                m++;
                max = Math.max(max, m-n);
            }
            else {
                hash[str.charAt(n)] = 0;
                n++;
            }
        }
        return max;
    }
}
