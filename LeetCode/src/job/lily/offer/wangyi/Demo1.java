package job.lily.offer.wangyi;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] score = new int[n];
        for (int i = 0; i < n ; i++){
            score[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while(q != 0){
            int m = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++){
                if (score[m-1] >= score[i]) count++;
            }
            double p = (double)(count-1)/n*100;
            java.text.DecimalFormat df = new java.text.DecimalFormat("0.000000");
            System.out.println(df.format(p));
            q--;
        }
    }
}
