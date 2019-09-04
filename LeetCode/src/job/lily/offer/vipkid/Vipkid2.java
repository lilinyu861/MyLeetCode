package job.lily.offer.vipkid;

import java.util.Arrays;
import java.util.Scanner;

public class Vipkid2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        String strs[] = nums.split(" ");
        int count = 0;
        int len = strs.length;
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            tmp[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(tmp);
        System.out.println(Arrays.toString(tmp));
        int start = 0, end = len - 1;
        while (start < end) {
            if (tmp[start] + tmp[end] > 0) end--;
            else if (tmp[start] + tmp[end] < 0) start++;
            else {
                int i = start;
                while (tmp[i] == tmp[start+1]){
                    start++;
                }
                i = start- i + 1;
                int j = end;
                while (tmp[j] == tmp[end-1]){
                    end --;
                }
                j = j - end + 1;

                start++;
                end --;
                count += i*j;
            }
        }
       System.out.println(count);
    }
}
