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
        target = target + sum;
        if(target % 2 == 1 || target < 0) return 0;
        target = target / 2;
        int[] dp = new int[target + 1];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = target; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                display(dp);
            }
            if(dp[target] == target) count++;
        }
        return count;
    }
}
// @lc code=end

