package com.zsr;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int [] a = new int[n+1];
        int [] b = new int[n+1];
        int [] c = new int[n+1];
        a[0] = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = Integer.MIN_VALUE;
                if (nums[i][j] > x) {
                    c[i] = a[i];
                    a[i] = nums[i][j];
                    b[i] = j;
                } else if(c[i] < nums[i][j]){
                    c[i] = x;
                }
            }
        }
        int ans = 0;
        for (int i=1; i<=n-1; i++){
            for (int j=i+1; j<=n; j++){
                if (b[i]!=b[j]) {
                    ans = Math.max(ans,a[i]*a[j]);
                }
                else {
                    ans=Math.max(ans,a[i]*c[j]);
                    ans=Math.max(ans,c[i]*a[j]);
                }
            }
        }
        System.out.println(ans);
    }
}
