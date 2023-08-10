/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        int temp = 0;
        if(n <= 1) return dp[n];
        for(int i = 2; i <= n; i++){
            temp = dp[1];
            dp[1] = dp[1] + dp[0];
            dp[0] = temp;
        }
        return dp[1];
    }
}
// @lc code=end

