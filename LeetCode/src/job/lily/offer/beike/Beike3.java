package job.lily.offer.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小明去海边游玩，他看到很多五颜六色的贝壳十分开心，于是他开始捡贝壳。小明的背包容量有限，所以他希望先捡价值大的贝壳，如果价值大的贝壳装不下了，再考虑价值次大的贝壳，直到背包再也装不下任何贝壳了。

 现在告诉你贝壳的种类和贝壳的数量，以及小明背包的体积和每种贝壳单个占用的体积，你能算出小明的背包中最多可以装下多少个贝壳么？
 */
public class Beike3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int tmp = 0;
            if (m/y[i] > 0){
                tmp = Math.min(x[i], m/y[i]);
                count += tmp;
            }
            m -= y[i]*tmp;
        }
        System.out.println(count);
    }


}
