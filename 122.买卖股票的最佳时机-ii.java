/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int ls = prices.length;
        int[] dp = new int[ls];
        dp[0] = 0;
        for(int i = 1; i < ls; i++){
            if(prices[i] - prices[i - 1] >= 0){
                dp[i] = dp[i- 1] + prices[i] - prices[i - 1];
            }
            else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[ls - 1];
    }
}
// @lc code=end

