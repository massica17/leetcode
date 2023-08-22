/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 买卖股票的最佳时机含冷冻期
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1) return 0;
        int[][] dp = new int[n][4];
        
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        dp[0][3] = 0;
        for(int i = 1; i < n; i++){
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            if(i >= 2){
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 2][1] - prices[i]);
                dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] + prices[i]);
            }
        }
        return dp[n - 1][3];
    }
}
// @lc code=end

