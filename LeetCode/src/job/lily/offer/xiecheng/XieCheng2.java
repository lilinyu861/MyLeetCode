package job.lily.offer.xiecheng;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class XieCheng2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int schedule(int m,int[] array) {
        if (array.length == 0) return 0;
        int l = getMax(array);
        int r = getSum(array);
        while (l < r) {
            int mid = l + (r - l) / 2;
            int requiredWorker = getRequiredWorker(array, mid);
            if (requiredWorker <= m){
                r = mid;
            }
            else
                l = mid+1;
        }
        return l;
    }

    public static int getRequiredWorker(int [] array,int maxTime){
        int sum = 0, numWorker = 1;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if (sum > maxTime){
                sum = array[i];
                numWorker++;
            }
        }
        return numWorker;
    }

    public static int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int a:array){
            max = Math.max(max,a);
        }
        return max;
    }

    public static int getSum(int[] array){
        int sum = 0;
        for (int a : array){
            sum+=a;
        }
        return sum;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }
}
