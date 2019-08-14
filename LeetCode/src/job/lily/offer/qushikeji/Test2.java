import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
        private static String process(String num1, String num2)
        {
            //Please write your code here
            String [] counts = num1.split(" ");
            List<Integer> list = new ArrayList<Integer>();
            int [] value = new int[]{1, 5, 10, 20, 50, 100};
            int i = 0;
            for(String c:counts){
                int count = Integer.parseInt(c);
                while(count>0){
                    list.add(value[i]);
                    count--;
                }
                i++;
            }
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> tmp = new ArrayList<Integer>();
            dfs(list, Integer.parseInt(num2), res, tmp, 0, 0);
            int result = 0;
            for(List<Integer> l:res){
                result+=l.size();
            }
            return result+"";

        }
        private static void dfs(List<Integer> list, int num, List<List<Integer>> res, List<Integer> tmp, int sum, int start){
            if(sum == num)
                res.add(new ArrayList<Integer>(tmp));
            else if(sum > num)
                return;
            int lastUsed = Integer.MIN_VALUE;
            for(int i = start; i < list.size(); i++){
                if(list.get(i) < num && list.get(i) != lastUsed){
                    tmp.add(list.get(i));
                    dfs(list, num, res, tmp, sum+list.get(i), i+1);
                    lastUsed = tmp.get(tmp.size()-1);
                    tmp.remove(tmp.size()-1);
                }
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String strValueSequences = sc.nextLine();
            String strChargeNum = sc.nextLine();

            String sum = process(strValueSequences, strChargeNum);
            System.out.println(sum);
        }
}
