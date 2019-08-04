package job.lily.offer.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        for (int i = 0; i < t; i++){
            n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++){
                nums[j] = sc.nextInt();
                Arrays.sort(nums);
                if (nums[nums.length-1] < nums[nums.length-2] + nums[nums.length-3]){
                    System.out.println("YES"); break;
                }
                else{
                    System.out.println("NO"); break;
                }

            }
        }
    }
}
