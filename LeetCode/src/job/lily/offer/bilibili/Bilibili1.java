package job.lily.offer.bilibili;

import java.util.Scanner;

public class Bilibili1 {
    public static boolean check(String n) {
        if (n.length() <= 1) return true;
        int count = 1;
        if (n.charAt(0) >= 'a' && n.charAt(0) <= 'z') {
            for (int i = 1; i < n.length(); i++) {
                if (n.charAt(i) < 'a')
                    return false;
            }
        } else if (n.charAt(0) >= 'A' && n.charAt(0) <= 'Z') {
            if (n.charAt(1) >= 'a' && n.charAt(1) <= 'z' && n.length() > 2) {
                for (int i = 2; i < n.length(); i++) {
                    if (n.charAt(i) < 'a') return false;
                }
            } else {
                for (int i = 1; i < n.length(); i++) {
                    if (n.charAt(0) > 'Z') return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        boolean res = check(n);
        System.out.println(res);
    }
}
