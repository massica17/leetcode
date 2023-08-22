/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[2][n];
        dp[0][0] = -prices[0];
        for(int i = 1; i < n; i++){
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1] - prices[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[0][i - 1] + prices[i] - fee);
        }
        return dp[1][n - 1];
    }
}
// @lc code=end

