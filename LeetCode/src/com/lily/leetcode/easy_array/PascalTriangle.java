package com.lily.leetcode.easy_array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {
    // row一直叠用
    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
            row.add(0,1);
            for(int j=1 ; j<i; j++)
                row.set(j, row.get(j)+row.get(j+1));
            a.add(new ArrayList<Integer>(row));
        }
        return a;
    }


    // 在头尾添加1，然后将根据上一行的数据计算本行数据
    private static List<List<Integer>> generate1(int numRows){
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        if (numRows<1)
            return a;
        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j =0 ; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
                }
            }
            a.add(row);
        }
        return a;
    }

    public static void main(String[] args){
        int n = 5;
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> result1 = new ArrayList<>();
        result = generate(n);
        result1 = generate1(n);
        System.out.println(result);
        System.out.println(result1);
    }
}
