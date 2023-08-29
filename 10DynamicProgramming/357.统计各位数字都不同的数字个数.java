/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 统计各位数字都不同的数字个数
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= i - 1; j++){
                dp[i] += dp[j];
            }
            dp[i] += dp[i - 1] * (10 - i);
        }
        return dp[n];
    }
}
// @lc code=end

