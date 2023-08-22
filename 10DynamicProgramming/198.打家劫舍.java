/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int nl = nums.length;
        int[] dp = new int[nl + 1];
        dp[1] = nums[0];
        if(nl <= 1) return dp[nl];

        for(int i = 2; i <= nl; i++){
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        return dp[nl];
    }
}
// @lc code=end

