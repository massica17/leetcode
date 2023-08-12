/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start

import java.util.*;

class Solution {
    public void display(int[] dp){
        for(int i = 0; i < dp.length; i++){
            System.out.printf("%d:%d ", i, dp[i]);
        }
        System.out.println();
    }
    public int numSquares(int n) {
        List<Integer> arr = new ArrayList<>();
        int s = 1;
        while(s * s <= n){
            arr.add(s * s);
            s++;
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = arr.get(i); j <= n; j++){
                dp[j] = Math.min(dp[j], dp[j - arr.get(i)] + 1);
                //display(dp);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        so.numSquares(12);
    }
}
// @lc code=end

