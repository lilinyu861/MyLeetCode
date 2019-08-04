package job.lily.offer.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0 ; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i; j < n ;j++){
                if(nums[j] < nums[min]) min=j;
            }
            if ((nums[i] + nums[min])%2 == 1){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
//            for (int k = 0; k < min; k++){
//                if ((nums[k]+nums[min])%2 == 1){
//                    int temp = nums[min];
//                    nums[min] = nums[k];
//                    nums[k] = temp;
//                }
//            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
