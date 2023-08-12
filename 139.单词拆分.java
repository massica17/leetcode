/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start

import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        int n = wordDict.size();
        boolean[] dp = new boolean[size + 1];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < i && !dp[j]; j++){
                if()
            }
        }
    }
}
// @lc code=end

