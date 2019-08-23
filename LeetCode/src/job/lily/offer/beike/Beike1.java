package job.lily.offer.beike;

import java.util.Arrays;
import java.util.Scanner;

public class Beike1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), S = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > S) {
                System.out.println(i);
                break;
            }
        }
    }
}
