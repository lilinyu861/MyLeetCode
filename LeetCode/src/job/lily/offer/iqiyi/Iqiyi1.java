package job.lily.offer.iqiyi;

import java.util.Scanner;

public class Iqiyi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong(), y = in.nextLong(), z = in.nextLong(), k = in.nextLong();
        long sum = 0;
//        long n = Math.min(Math.min(x-1, y-1), z-1);
//        long a = n, b = n, c = n;
//        k -= n;
        long a = 0, b = 0 ,c = 0;
        while (k > 0){
            if (x > 1 && k>0){
                a += 1;
                x -= 1;
                k -= 1;
            }
           if (y > 1 && k>0){
                b += 1;
                y -= 1;
               k -= 1;
            }
            if (z > 1 && k>0){
                c += 1;
                z -= 1;
                k -= 1;
            }
            if (x <=1 && y<=1 && z<=1) break;
        }
        sum = (a+1)*(b+1)*(c+1);
        System.out.println(sum);
    }
}
