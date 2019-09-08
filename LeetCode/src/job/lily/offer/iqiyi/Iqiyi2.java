package job.lily.offer.iqiyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iqiyi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] seq = new int[N-1];
        int[] num = new int[N];
        for (int i = 0; i < seq.length; i++){
            seq[i] = in.nextInt();
        }
        for (int i = 0; i < num.length; i++){
            num[i] = i+1;
        }
        List<List<Integer>> p = permute(num);
        System.out.println(count(p,seq));
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i <nums.length; i++){
            List<List<Integer>> tmp = new ArrayList<>();
            for (int j = 0; j < res.size(); j++){
                List<Integer> list = res.get(j);
                for (int k = 0; k <= list.size(); k++){
                    List<Integer> t = new ArrayList<>(list);
                    t.add(k, nums[i]);
                    tmp.add(t);
                }
            }
            res = tmp;
        }
        return res;
    }

    public static int count(List<List<Integer>> p, int[] seq){
        int res = 0;
        for(List<Integer>  t:p){
            int i = 0;
            for (; i < t.size()-1; i++){
                if (seq[i] == 1 && t.get(i) < t.get(i+1)|| (seq[i]==0&& t.get(i)>t.get(i+1))){
                    break;
                }
            }
            if (i == t.size()-1){
                res++;
            }
        }
        return res;
    }
}
