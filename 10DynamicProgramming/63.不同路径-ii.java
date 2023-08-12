/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        int i = 0;
        while(i < m && obstacleGrid[i][0] != 1){
            dp[i][0] = 1;
            i++;
        }
        int j = 0;
        while(j < n && obstacleGrid[0][j] != 1){
            dp[0][j] = 1;
            j++;
        }
        for(i = 1; i < m; i++){
            for(j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end

