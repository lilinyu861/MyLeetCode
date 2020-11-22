package job.lily.offer.didi;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        String ans = "No";
        while (n > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int [] a = new int[(y+1)*2];
            int j = 0;
            for (int i = 0; i < y; i++) {
                int temp1 = in.nextInt();
                int temp2 = in.nextInt();
                int tempK = in.nextInt();
                if (tempK < z) {
                    a[j] = temp1;
                    j++;
                    a[j] = temp2;
                    j++;
                }
            }
            Arrays.parallelSort(a);
            System.out.println(a);
            if (a[0] != 1) {
                ans = "No";
                break;
            }
            for (int i = 1; i < (y+1)*2; i++) {
                if (a[i] - a[i-1] == 0 || a[i] == a[i-1]) {
                    continue;
                } else if (a[(y+1)*2] == x) {
                    ans = "Yes";
                    break;
                } else {
                    ans = "No";
                }
            }
            n--;
        }
        System.out.println(ans);
    }
}
