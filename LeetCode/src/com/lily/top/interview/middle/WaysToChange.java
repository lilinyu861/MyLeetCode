package com.lily.top.interview.middle;

/**
 * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 *
 * 示例1:
 *
 *  输入: n = 5
 *  输出：2
 *  解释: 有两种方式可以凑成总金额:
 * 5=5
 * 5=1+1+1+1+1
 * 示例2:
 *
 *  输入: n = 10
 *  输出：4
 *  解释: 有四种方式可以凑成总金额:
 * 10=10
 * 10=5+5
 * 10=5+1+1+1+1+1
 * 10=1+1+1+1+1+1+1+1+1+1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class WaysToChange {
    // 25有13种组合方式，10有4种组合方式，5有2种组合方式，1有一种组合方式。
    public int waysToChange(int n) {
        int ans[][] = new int[4][n+1];
        int [] coins = {1, 5, 10, 25};
        for (int i = 0; i <= n; i++){
            ans[0][i] = 1;
        }
        for (int i = 0; i < 4; i++){
            ans[i][0] = 1;
        }
        for (int i = 1; i < 4; i++){
            for (int j = 1; j <= n; j++){
                if (j>=coins[i]) ans[i][j] = (ans[i-1][j]+ans[i][j-coins[i]])%1000000007;
                else ans[i][j] = ans[i-1][j];
            }
        }
        return ans[3][n];
    }
}
