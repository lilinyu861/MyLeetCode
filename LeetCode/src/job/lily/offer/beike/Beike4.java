package job.lily.offer.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 假设有N个物品，其中第i个物品的重量为Wi。现在要将这些物品分成两堆，
 * 使得在“第一堆物品的总重量与第二堆物品的总重量之差尽可能小”的前提下，
 * 第一堆物品的数量与第二堆物品的数量之差尽可能大。那么，两堆物品的总重量之差最小是多少？
 * 在总重量之差最小的前提下，两堆物品的数量之差最大是多少？
 *
 * 输入
 第一行包含一个整数N，2≤N≤100。

 第二行包含N个空格隔开的整数W1到WN，1≤Wi≤100。

 输出
 输出两个空格隔开的整数，第一个整数表示两堆物品的总重量之差的最小值，第二个整数表示在总重量之差最小的前提下，两堆物品的数量之差的最大值。


 样例输入
 6
 1 2 3 4 5 6
 样例输出
 1 2
 */
public class Beike4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] w = new int[n];
        for (int i = 0; i<n; i++){
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

    }
}