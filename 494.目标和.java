/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public void display(int[] dp){
        for(int i = 0; i < dp.length; i++){
            System.out.printf("%d ", dp[i]);
        }
        System.out.println();
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        if ( target < 0 && sum < -target) return 0;
        target = target + sum;
        if(target % 2 == 1 || target < 0) return 0;
        target = target / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = target; j >= nums[i]; j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
// @lc code=end

