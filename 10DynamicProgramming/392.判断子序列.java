/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        int[][] dp = new int[ls + 1][lt + 1];
        for(int i = 1; i <= ls; i++){
            for(int j = 1; j <= lt; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[ls][lt] == ls;
    }
}
// @lc code=end

