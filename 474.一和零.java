/*
 * @lc app=leetcode.cn id=474 lang=java
 *
 * [474] 一和零
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int ls = strs.length;
        int[] zero = new int[ls];
        int[] one = new int[ls];
        int n0 = 0, n1 = 0;
        for(int i = 0; i < ls; i++){
            n0 = 0;
            n1 = 0;
            for(int j = 0; j < strs[i].length(); j++){
                if(strs[i].charAt(j) == '0') n0++;
                else n1++;
            }
            zero[i] = n0;
            one[i] = n1;
        }
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i < ls; i++){
            for(int j = m; j >= zero[i]; j--){
                for(int k = n; k >= one[i]; k--){
                    dp[j][k] = Math.max(dp[j][k], dp[j - zero[i]][k - one[i]] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end

