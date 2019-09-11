package job.lily.offer.qianxin;

import java.util.Scanner;
/*
测试用例
1_1
3_2
5_1
8_3
20_4
 */
public class Qianxin1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int luck = 0;
        int num = n;
        while (num != 5 && n>5){
            num = ((num-num/5)+num%5)%6;
            luck++;
        }
        if (n < 5){
            luck += 5%n;
        }
        if (n == 1 || n == 5){
            luck += 1;
        }
        System.out.println(luck);
    }
}
