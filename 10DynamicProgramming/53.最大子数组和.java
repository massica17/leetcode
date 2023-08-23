/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            dp[i] = Math.max(dp[i - 1] + nums[i - 1], nums[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// @lc code=end

