/*
 * @lc app=leetcode.cn id=377 lang=java
 *
 * [377] 组合总和 Ⅳ
 */

// @lc code=start
class Solution {
    public void display(int[] dp){
        for(int i = 0; i < dp.length; i++){
            System.out.printf("%d ", dp[i]);
        }
        System.out.println();
    }
    public int combinationSum4(int[] nums, int target) {
        int size = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int j = 0; j < size; j++){
                if(i >= nums[j]){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
// @lc code=end

