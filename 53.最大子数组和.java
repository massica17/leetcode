/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxSubArray(int[] nums) {
        int ls = nums.length;
        int[] dp = new int[ls];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < ls; i++){
            int temp = dp[i - 1] + nums[i];
            if(temp > nums[i]) dp[i] = temp;
            else dp[i] = nums[i]; 
            if(max < dp[i]) max = dp[i];
        }
        return max;
    }
}
// @lc code=end

