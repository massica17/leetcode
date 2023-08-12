/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start

class Solution {
    public void display(boolean[] dp){
        for(int i = 0; i < dp.length; i++){
            System.out.printf("%d:%s ",i, dp[i] ? "True" : "False");
        }
        System.out.println();
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        int len = 0;
        for(int i = 1; i <= s.length(); i++){
            for(String word : wordDict){
                len = word.length();
                if(i >= len && dp[i - len] && word.equals(s.substring(i - len, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
// @lc code=end

