/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public void display(int[] dp){
        for(int i = 0; i < dp.length; i++){
            System.out.printf("%d ", dp[i]);
        }
        System.out.println();
    }
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            for(int j = 1; j <= i-j; j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));
                display(dp);
            }
        }
        return dp[n];
    }
}
// @lc code=end

