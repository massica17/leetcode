/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int nl = nums.length;
        if(nl == 0) return 0;
        if(nl == 1) return nums[0];
        return Math.max(robAction(nums, 0, nl - 2), robAction(nums, 1, nl - 1));
    }

    public int robAction(int[] nums, int slow, int fast){
        int nl = fast - slow + 1;
        int[] dp = new int[nl + 1];
        dp[1] = nums[slow];
        if(nl <= 1) return dp[nl];
        for(int i = 2; i <= nl; i++){
            dp[i] = Math.max(dp[i - 2] + nums[slow + i - 1], dp[i - 1]);
        }
        return dp[nl];
    }
}
// @lc code=end

