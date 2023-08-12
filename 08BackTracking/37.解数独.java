/*
 * @lc app=leetcode.cn id=37 lang=java
 *
 * [37] 解数独
 */

// @lc code=start

import java.util.*;

class Solution {
    private int[][] w;
    private int[][] h;
    private int[][][] s;
    private boolean backTracking(char[][] board){
        int count = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    count++;
                    continue;
                }
                if(count == 81) return true;
                for(int k = 0; k < 9; k++){
                    if(h[i][k] == 0 && w[j][k] == 0 && s[i/3][j/3][k] == 0){
                        h[i][k]++;
                        w[j][k]++;
                        s[i/3][j/3][k]++;
                        board[i][j] = (char)('1' + k);
                        if(backTracking(board)){
                            return true;
                        }
                        h[i][k]--;
                        w[j][k]--;
                        s[i/3][j/3][k]--;
                        board[i][j] = '.';
                    }
                    else continue;
                }
                return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        w = new int[9][9];
        h = new int[9][9];
        s = new int[3][3][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int temp = board[i][j] - '1';
                    w[j][temp] ++;
                    h[i][temp] ++;
                    s[i/3][j/3][temp]++;
                }
            }
        }
        backTracking(board);
    }
}
// @lc code=end

