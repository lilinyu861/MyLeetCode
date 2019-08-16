package job.lily.offer.qihu360;

import java.util.Arrays;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long max_x = Integer.MIN_VALUE, min_x = Integer.MAX_VALUE;
        long max_y = Integer.MIN_VALUE, min_y = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            long temp = in.nextInt();
            max_x = temp > max_x?temp:max_x;
            min_x = temp < min_x?temp:min_x;
            long temp1 = in.nextInt();
            max_y = temp1 > max_y?temp:max_y;
            min_y = temp1 < min_y?temp:min_y;
        }
        long len = Math.max(max_x-min_x, max_y-min_y);
        System.out.println(len*len);
    }
}
