/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        int ls = s.length();
        int[][] dp = new int[ls + 1][ls + 1];
        for(int i = ls - 1; i >= 0; i--){
            dp[i][i] = 1;
            for(int j = i + 1; j < ls; j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][ls - 1];
    }

}
// @lc code=end

