package job.lily.offer.qihu360;
import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        //左右面积
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, a[i][j]);

            }
            sum += 2 * max;
            max = 0;
        }

        //前后面积
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, a[j][i]);
            }
            sum += 2 * max;
            max = 0;
        }

        //上下面面积
        sum += m * n * 2;
        System.out.println(sum);
    }
}
