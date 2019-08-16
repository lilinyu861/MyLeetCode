package job.lily.offer.qihu360;

import java.util.Arrays;
import java.util.Scanner;

public class Test003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] a= new int[n];
        int [] b= new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            b[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(b));
    }
}
