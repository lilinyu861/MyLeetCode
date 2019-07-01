package com.lily.leetcode.medium_array;

import java.util.HashMap;

public class ValidSudoku {
    private static boolean isValidSudoku(char[][] board) {
        HashMap<String,Boolean> map = new HashMap<>();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                char num = board[i][j];
                if (num == '.') continue;
                String rowKey = i+"row"+num;
                String colKey = j+"col"+num;
                int groupIndex = i/3+j/3*3;
                String groupKey = groupIndex+"group"+num;
                //getOrDefault，如果已经有key值，则返回key值，及if条件中满足（已经存在重复数字），返回false
                if (map.getOrDefault(rowKey, false)||
                        map.getOrDefault(colKey, false)||
                        map.getOrDefault(groupKey, false))
                {
                    return false;
                }
                map.put(rowKey, true);
                map.put(colKey, true);
                map.put(groupKey, true);

            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] board = new char[][]{
                {'5','3','5','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean result = isValidSudoku(board);
        System.out.println(result);
    }
}
