/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        boolean[] has = new boolean[n + 1];
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                if(!has[j - 1]){
                    dp[j] = dp[j - 1] + nums[i];
                    has[j] = true;
                }
                else {

                }
            }
        }
    }
}
// @lc code=end

