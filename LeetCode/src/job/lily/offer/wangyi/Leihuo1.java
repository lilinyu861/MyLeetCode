package job.lily.offer.wangyi;

import java.util.Scanner;

/**
 *
 */
public class Leihuo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if ((str.charAt(i) >= 'a' && str.charAt(i)<='z' )||(str.charAt(i) >= 'A' && str.charAt(i)<='Z' ))
                res.append(str.charAt(i));
            else{
                res.append(str.charAt(i));
            }
        }
        System.out.println(res.toString());

    }
}
