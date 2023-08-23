/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 1; i <  n; i++){
            if(nums[i] > nums[i - 1]) dp[i] = dp[i - 1] + 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
// @lc code=end

