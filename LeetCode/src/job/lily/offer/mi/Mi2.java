package job.lily.offer.mi;

import java.util.Scanner;

public class Mi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            findNum(in.nextInt());
        }
    }

    public static void findNum(int n){
        int right = 100, left = 1, mid = (left+right)/2;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += i;
            if (sum > n){
                System.out.println("No");
                break;
            }
            if (sum == n){
                System.out.println(i);
                break;
            }
        }
    }
}
