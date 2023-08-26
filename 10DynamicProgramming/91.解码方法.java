/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int count = 0;

    public boolean getNums(char a, char b){
        if(a == '0') return false;
        int res = a - '0';
        res *= 10;
        res += b - '0';
        return res >= 1 && res <= 26;
    }
    public int numDecodings(String s) {
        int ls = s.length();
        if(ls == 0) return 0;
        char[] cs = s.toCharArray();
        if(cs[0] == '0') return 0;
        if(ls == 1) return 1;
        int[] dp = new int[ls];
        dp[0] = 1;
        if(cs[1] == '0'){
            if(getNums(cs[0], cs[1])){
                dp[1] = 1;
            }
            else return 0;
        }
        else{
            if(getNums(cs[0], cs[1])){
                dp[1] = 2;
            }
            else{
                dp[1] = 1;
            }
        }
        System.out.println(Arrays.toString(dp));
        int i = 2;
        while(i < ls){
            if(cs[i] == '0'){
                if(!getNums(cs[i - 1], cs[i])) return 0;
                dp[i] = dp[i - 2];
                if(i + 1 < ls) dp[i + 1] = dp[i];
                i += 2;
            }
            else{
                if(getNums(cs[i - 1], cs[i])) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                else{
                    dp[i] = dp[i - 1];
                }
                i++;
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[ls - 1];
    }
}
// @lc code=end

