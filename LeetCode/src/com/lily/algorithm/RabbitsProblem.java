package com.lily.algorithm;

import java.util.Scanner;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 *
 * 思路：使用斐波那契方法解决这个问题
 * 幼仔对数=前月成兔对数
 * 成兔对数=前月成兔对数+前月幼仔对数
 * 总体对数=本月成兔对数+本月幼仔对数
 */
public class RabbitsProblem {

    private static int getRabbitNum(int month){
        if (month<=0) return 0;
        else if (month == 1 || month==2) return 1;
        else{
            return getRabbitNum(month-1)+getRabbitNum(month-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = getRabbitNum(num);
        System.out.println(result);
    }
}
