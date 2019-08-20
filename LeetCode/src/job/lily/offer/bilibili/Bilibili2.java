package job.lily.offer.bilibili;
import java.util.Scanner;


public class Bilibili2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String res = multiply(num1, num2);
        System.out.println(res);
    }

    public static String multiply(String num1, String num2){
        if(num1.equals("0") || num2.equals("0")) return "0";
        int [] pos = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >=0 ; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + pos[i+j+1];
                pos[i+j] += sum/10;
                pos[i+j+1] = sum %10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < pos.length; i++){
            if( i == 0 && pos[i] == 0)
                continue;
            sb.append(pos[i]);
        }
        return sb.toString();
    }
}

