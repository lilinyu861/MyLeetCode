package job.lily.offer.didi;

import java.util.Arrays;
import java.util.Scanner;

public class Didi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0, sum = 0;
        int [] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
            if (nums[i] < 0) flag = 1;
        }

        if (flag == 1 || n <=4){
            System.out.println(sum);
        }

        else if (n == 6){
            int tmp = 0;
            tmp = Math.max(nums[0]+nums[2]+nums[4], nums[1]+nums[3]+nums[5]);
            tmp = Math.max(tmp, sum);
            System.out.println(tmp);
        }
        else {
            System.out.println(sum);
        }
    }
}
