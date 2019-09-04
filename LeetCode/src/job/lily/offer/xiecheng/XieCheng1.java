package job.lily.offer.xiecheng;

import java.util.Scanner;

public class XieCheng1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long sum_rabbit = 1;
        long one_age = 1;
        long two_age = 1;
        for (int i = 1; i < n-1; i++){
            if (n < 3) sum_rabbit=1;
            else {
                sum_rabbit = one_age + two_age;
                one_age = two_age;
                two_age = sum_rabbit;
            }
        }
        System.out.println(sum_rabbit);
    }
}
