/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = max > dp[i] ? max : dp[i];
            //System.out.println(Arrays.toString(dp));
        }
        return max;
    }
}
// @lc code=end

