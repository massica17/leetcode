/*
 * @lc app=leetcode.cn id=97 lang=java
 *
 * [97] 交错字符串
 */

// @lc code=start
class Solution {
    public boolean backTracking(String s1, int ind1, String s2, int ind2, String s3, int ind3){
        if(ind1 == s1.length() && ind2 == s2.length() && ind3 == s3.length()){
            return true;
        }
        if(ind3 == s3.length()) return false;
        char c = s3.charAt(ind3);
        boolean res_1 = false;
        boolean res_2 = false;
        if(ind1 < s1.length() && s1.charAt(ind1) == c){
            res_1 = backTracking(s1, ind1 + 1, s2, ind2, s3, ind3 + 1);
        }
        if(ind2 < s2.length() && s2.charAt(ind2) == c){
            res_2 = backTracking(s1, ind1, s2, ind2 + 1, s3, ind3 + 1);
        }
        return res_1 || res_2;
    }
    public boolean isInterleave2(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if(len1 + len2 != len3) return false;
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        int ind = 0;
        while(ind < len2 && s2.charAt(ind) == s3.charAt(ind)){
            dp[0][ind + 1] = true;
            ind++;
        }
        ind = 0;
        while(ind < len1 && s1.charAt(ind) == s3.charAt(ind)){
            dp[ind + 1][0] = true;
            ind++;
        }
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(dp[i - 1][j]){
                    dp[i][j] = (s1.charAt(i - 1) == s3.charAt(i + j - 1));
                }
                else if(dp[i][j - 1]){
                    dp[i][j] = (s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        return dp[len1][len2];
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if(len1 + len2 != len3) return false;

        boolean[] dp = new boolean[len2 + 1];
        dp[0] = true;

        for(int i = 0; i <= len1; i++){
            for(int j = 0; j <= len2; j++){
                if(i > 0) dp[j] = dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                if(j > 0) dp[j] = dp[j] || dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
            }
        }
        return dp[len2];
    }
    
}
// @lc code=end

