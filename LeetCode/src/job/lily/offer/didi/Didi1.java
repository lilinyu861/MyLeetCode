package job.lily.offer.didi;

import java.util.Arrays;
import java.util.Scanner;

public class Didi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums= new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                nums[i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < n; i++){
//            System.out.println(Arrays.toString(nums[i]));
//        }
        for (int j = 0; j < m; j++){
            int max = 0;
            for (int i = 0; i < n; i++){
                if (nums[i][j] > max) max = nums[i][j];
            }
            sum += max;
        }
        System.out.println(sum);
    }
}
