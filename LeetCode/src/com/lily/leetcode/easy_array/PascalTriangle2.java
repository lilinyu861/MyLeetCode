package com.lily.leetcode.easy_array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 */
public class PascalTriangle2 {
    // row每次循环在前面插入1，然后做计算
    private static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            row.add(0,1);
            for(int j=1; j<i; j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
        }
        return row;
    }

    public static void main(String[] args){
        int rowIndex = 3;
        List<Integer> result = new ArrayList<>();
        result = getRow(rowIndex);
        System.out.println(result);
    }
}
