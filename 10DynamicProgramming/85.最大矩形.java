/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == '1'){
                    if(j != 0) dp[i][j] = dp[i][j - 1] + 1;
                    else dp[i][j] = 1;
                }
                else dp[i][j] = 0;
            }
        }
        
    
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int min_left = dp[i][j];
                for(int k = i; k >= 0; k--){
                    min_left = Math.min(min_left, dp[k][j]);
                    max = Math.max(max, min_left * (i - k + 1));
                }
            }
        }
        return max;
    }
}
// @lc code=end

