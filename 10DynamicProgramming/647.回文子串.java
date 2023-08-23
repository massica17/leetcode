/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int ls = s.length();
        int res = 0;
        boolean[][] dp = new boolean[ls][ls];
        for(int i = ls - 1; i >= 0; i--){
            for(int j = i; j < ls; j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i <= 1){
                        res++;
                        dp[i][j] = true;    
                    }
                    else if(dp[i + 1][j - 1]){
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

