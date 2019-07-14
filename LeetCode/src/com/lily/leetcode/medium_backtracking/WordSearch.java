package com.lily.leetcode.medium_backtracking;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * Example:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */
public class WordSearch {
    char [][] board;
    String word;
    boolean [][] b1;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        b1 = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0 ; j < board[0].length; j++){
                if(find(i, j, 0)==true)
                    return true;
            }
        }
        return false;
    }

    private boolean find(int i, int j, int index_word){
        if (index_word == word.length())
            return true;
        if (i<0||i>=board.length||j<0||j>=board[0].length
            || board[i][j]!=word.charAt(index_word)
            || b1[i][j] == true) return false;
        else b1[i][j] = true;
        boolean res = find(i-1,j,index_word+1)||find(i+1,j,index_word+1)||
                find(i,j+1, index_word+1)||find(i,j-1,index_word+1);
        b1[i][j] = false;
        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        boolean result = new WordSearch().exist(board, word);
        System.out.println(result);
    }
}
