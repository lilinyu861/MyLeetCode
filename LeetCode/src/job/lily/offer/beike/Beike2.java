package job.lily.offer.beike;
/**
 *
 *  4
 oooo BC
 xxxx C
 xooo ABC
 oxoo B
 */

import java.util.Arrays;
import java.util.Scanner;

public class Beike2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];
        String tmp = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
//        System.out.println(Arrays.toString(str));
        String [] choose = new String[n];
        String [] right = new String[n];
        //获取学生选项和正确答案
        for (int i = 0; i < n; i++){
            String temp = "";
            for (int j = 0 ; j < 4; j++)
            {
                if (str[i].charAt(j) == 'x')
                {
                    temp += (char)('A'+j);
                }
            }
            choose[i] = temp;
            right[i] = str[i].substring(5, str[i].length());
        }
        System.out.println(Arrays.toString(choose));
        System.out.println(Arrays.toString(right));
        //计算得分
        for(int i = 0; i < n; i++){
            if (right[i].equals(choose[i])) sum+=5;
            else if (right[i].contains(choose[i]) && choose[i].length()>0) sum += 3;
            else sum+=0;
        }
        System.out.println(sum);

    }
}
