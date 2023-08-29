/*
 * @lc app=leetcode.cn id=221 lang=java
 *
 * [221] 最大正方形
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        int[][] dp = new int[h + 1][w + 1];
        for(int i = 1; i  <= h; i++){
            for(int j = 1; j <= w; j++){
                if(matrix[i - 1][j - 1] == '1'){
                    dp[i][j] = dp[i][j - 1] + 1;
                }
                else dp[i][j] = 0;
            }
        }
        int res = 0;
        for(int i =1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                int min_len = Integer.MAX_VALUE;
                int width;
                for(int k = i; k >= 1; k--){
                    width = i - k + 1;
                    min_len = Math.min(min_len, dp[k][j]);
                    if(width == min_len) res = Math.max(res, width * width);
                    if(width > min_len) break;
                }
            }
        }
        return res;
    }
}
// @lc code=end

