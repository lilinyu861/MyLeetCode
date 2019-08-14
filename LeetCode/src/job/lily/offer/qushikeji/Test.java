import java.util.Scanner;

public class Test
{
        private static String add(String num1, String num2)
        {
            //Please write your code here
            char[] num1Chars = new StringBuffer(num1).reverse().toString().toCharArray();
            char[] num2Chars = new StringBuffer(num2).reverse().toString().toCharArray();
            int len1 = num1Chars.length, len2 = num2Chars.length;
            int max_len = len1;
            if(len2 > len1) max_len = len2;
            int[] result = new int[max_len+1];

            for(int i = 0; i < result.length; i++){
                    if(num1Chars[i] == '.'){
                        continue;
                    }
                    int aint = i < len1?(num1Chars[i] - '0') : 0;
                    int bint = i < len2?(num2Chars[i] - '0') : 0;
                    result[i] += aint+bint;

                if(result[i]>=10){
                    result[i+1] += result[i]/10;
                    result[i] %= 10;
                }
            }
            StringBuffer sb = new StringBuffer();
            if(result[result.length-1] == 1) sb.append(result[1]);
            for(int i = result.length-2; i>=0; i--){
                sb.append(result[i]);
            }
            return sb.toString();
        }

        // please don't modify any code below.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String num1 = sc.nextLine();
            String num2 = sc.nextLine();

            String sum = add(num1, num2);
            System.out.println(sum);
        }

}
