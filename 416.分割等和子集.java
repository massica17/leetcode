/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        if(n <= 1) return false;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        if(sum % 2 == 1) return false;
        int target = sum/2;
        int[] dp = new int[target + 1];
        dp[0] = 0;
        for(int i = 0; i < n; i++){
            for(int j = target; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
// @lc code=end

