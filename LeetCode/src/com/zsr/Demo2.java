package com.zsr;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int count = 0;
        for (count = 0; n > 0; count++) {
            n &= n-1;
        }
        System.out.println(count);
    }
}
