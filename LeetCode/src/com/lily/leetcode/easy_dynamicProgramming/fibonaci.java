package com.lily.leetcode.easy_dynamicProgramming;

public class fibonaci {
    //动态规划
    public int fibonaci(int n ){
        if (n == 1 || n==2) return 1;
        int f1 = 1, f2 = 1;
        for (int i = 3; i <=n; i++){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }

    //迭代
    public int fibonaci2(int n){
        if (n == 1 || n==2) return n;
        else return fibonaci(n-1)+fibonaci(n-2);
    }


    public static void main(String[] args) {
        int n = 6;
        int result = new fibonaci().fibonaci(n);
        System.out.println(result);
        int result2 = new fibonaci().fibonaci2(n);
        System.out.println(result2);
    }
}
