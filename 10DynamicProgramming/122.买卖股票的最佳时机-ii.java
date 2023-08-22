/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int maxProfit(int[] prices) {
        List<Integer> nums = new ArrayList<>();
        int[] dp = new int[prices.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= prices.length; i++){
            if(prices[i - 1] >= prices[i - 2]) dp[i] = dp[i - 1] + prices[i - 1] - prices[i - 2];
            else dp[i] = dp[i - 1];
        }
        return dp[prices.length];
    }
}
// @lc code=end

